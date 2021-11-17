package com.softdevj.graphqlapi.graphql;

import java.io.IOException;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import graphql.GraphQL;
import graphql.schema.GraphQLSchema;
import graphql.schema.idl.RuntimeWiring;
import graphql.schema.idl.SchemaGenerator;
import graphql.schema.idl.SchemaParser;
import graphql.schema.idl.TypeDefinitionRegistry;
import graphql.schema.idl.TypeRuntimeWiring;
import graphql.schema.idl.errors.SchemaProblem;

@Component
public class GraphQLProvider {
	
	// Nota: todas la peticiones de GraphQL son del tipo POST

	// configuramos el uso de GraphQL resolviendo el schema definido en la carpeta
	// de Resources

	// para hacer uso de dataFetching tenemos que definir "GraphQLDataFetchers" e
	// inyectarlo

	@Autowired
	private GraphQLDataFetchers graphQLDataFetchers;

	// obtener el esquema de graphQL por medio de spring

	@Value("classpath:schema.graphqls")
	private Resource resource;

	// creamos una propiedad del tipo graphql

	private GraphQL graphQL;

	// creamos un método para inicializarlo y lo anotamos como "postConstruct"

	@PostConstruct
	public void init() throws SchemaProblem, IOException {

		GraphQLSchema graphQLSchema = this.buildSchema();
		this.graphQL = GraphQL.newGraphQL(graphQLSchema).build();

	}

	// creamos un método que nos devuelva el esquema definido en resources

	private GraphQLSchema buildSchema() throws SchemaProblem, IOException {

		TypeDefinitionRegistry typeRegistry = new SchemaParser().parse(this.resource.getInputStream());
		SchemaGenerator schemaGenerator = new SchemaGenerator();

		return schemaGenerator.makeExecutableSchema(typeRegistry, buildWiring());

	}

	// para poder hacer uso del "GraphQLDataFetchers" sobre el esquema tenemos que
	// crear un metodo que devolvera un "RunTimeWiring", el cual contiene la operación
	// que llevaremos a cabo cuando se invoque al provider

	private RuntimeWiring buildWiring() {

		return RuntimeWiring.newRuntimeWiring().type(TypeRuntimeWiring.newTypeWiring("Query").dataFetcher("findAll",
				this.graphQLDataFetchers.getFindAllDataFetcher())).build();

	}

	// creamos un método que nos devuelva la propiedad graphQL y lo anotamos como
	// "bean" de spring
	@Bean
	public GraphQL graphQL() {
		return this.graphQL;
	}

}
