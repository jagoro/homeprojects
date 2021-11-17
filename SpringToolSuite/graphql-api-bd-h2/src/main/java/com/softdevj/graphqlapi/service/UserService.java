package com.softdevj.graphqlapi.service;

import java.util.List;

import com.softdevj.graphqlapi.graphql.objects.type.User;

public interface UserService {
	
	List<User> findAll();
	
}
