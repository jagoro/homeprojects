package com.softdevj.graphqlapi.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.softdevj.graphqlapi.graphql.objects.type.User;
import com.softdevj.graphqlapi.mappers.UserMapper;
import com.softdevj.graphqlapi.repositories.UserRepository;
import com.softdevj.graphqlapi.service.UserService;

// Se indica @Primary para decirle a spring que esta sera la clase principal del servicio 
// a inyectar en las dependencias en base a la interfaz definida

@Primary
@Service("userDBService")
public class UserDBServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> findAll() {
		// user -> UserMapper.entityToUser(user) = UserMapper::entityToUser
		return userRepository.findAll().stream().map(UserMapper::entityToUser).collect(Collectors.toList());
		
	}

}
