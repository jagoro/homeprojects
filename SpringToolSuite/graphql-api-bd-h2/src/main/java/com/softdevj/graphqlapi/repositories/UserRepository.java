package com.softdevj.graphqlapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softdevj.graphqlapi.entities.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

}
