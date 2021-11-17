package com.softdevj.graphqlapi.mappers;

import com.softdevj.graphqlapi.entities.UserEntity;
import com.softdevj.graphqlapi.graphql.objects.type.User;

// clase para transformar de User a UserEntity

public class UserMapper {

	public static UserEntity userToEntity(User user) {

		UserEntity entity = new UserEntity();

		entity.setId(user.getId());
		entity.setName(user.getName());
		entity.setSurname(user.getSurname());
		entity.setEmail(user.getEmail());

		return entity;

	}

	public static User entityToUser(UserEntity entity) {

		User user = new User();

		user.setId(entity.getId());
		user.setName(entity.getName());
		user.setSurname(entity.getSurname());
		user.setEmail(entity.getEmail());

		return user;

	}

}
