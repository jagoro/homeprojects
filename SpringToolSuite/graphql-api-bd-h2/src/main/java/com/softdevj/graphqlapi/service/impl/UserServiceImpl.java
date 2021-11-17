package com.softdevj.graphqlapi.service.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.softdevj.graphqlapi.graphql.objects.type.User;
import com.softdevj.graphqlapi.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Override
	public List<User> findAll() {
		return Arrays.asList(
				new User(1, "Miguel", "Hudson", "miguel@gmail.com"), 
				new User(2, "Amalia", "Melendez", "amelendez@gmail.com"), 
				new User(3, "Juan", "Perez", "jperez@hotmail.com"));
	}

}
