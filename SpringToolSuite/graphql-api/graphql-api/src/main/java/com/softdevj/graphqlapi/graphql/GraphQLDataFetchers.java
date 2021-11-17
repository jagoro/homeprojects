package com.softdevj.graphqlapi.graphql;

import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Component;
import graphql.schema.DataFetcher;

@Component
public class GraphQLDataFetchers {
	
	// creamos una lista con los datos de usuario
	private List<User> users = Arrays.asList(
			new User(1, "Miguel", "Hudson", "miguel@gmail.com"), 
			new User(2, "Amalia", "Melendez", "amelendez@gmail.com"), 
			new User(3, "Juan", "Perez", "jperez@hotmail.com")
	);

	// creamos el dataFetcher que nos devolvera la lista de usuarios
	
	public DataFetcher<List<User>> getFindAllDataFetcher() {
		// para hacer uso de dataFetching tenemos que ir al provider y obtenerlo "GraphQLDataFetchers"
		return dataFetchingEnvironment -> this.users;
		
	}
	
}

// creamos un objeto usuario en base al typo User definido en el esquema

class User {
	
	private Integer id;
	private String name;
	private String surname;
	private String email;
	
	public User(Integer id, String name, String surname, String email) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.email = email;
	}
	
	
}
