package com.softdevj.graphqlapi.graphql;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import com.softdevj.graphqlapi.graphql.objects.type.User;
import com.softdevj.graphqlapi.service.UserService;
import graphql.schema.DataFetcher;

@Component
public class GraphQLDataFetchers {
	
	// Nota: en esta clase se hacen las llamadas a endpoint del servicio
	
	@Autowired
	//@Qualifier("userDBService") // si no se indica que Qualifier usar del "service" se tiene que marcar la clase con la anotacion @Primary
	private UserService userService;
	
	
	// creamos el dataFetcher que nos devolvera la lista de usuarios
	// para hacer uso de dataFetching tenemos que ir al provider y obtenerlo "GraphQLDataFetchers"
	
	public DataFetcher<List<User>> getFindAllDataFetcher() {
			
		return dataFetchingEnvironment -> userService.findAll();
		
	}
	
}
