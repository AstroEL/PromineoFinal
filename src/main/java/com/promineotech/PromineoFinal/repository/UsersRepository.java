package com.promineotech.PromineoFinal.repository;

import org.springframework.data.repository.CrudRepository;

import com.promineotech.PromineoFinal.entity.User;

public interface UsersRepository extends CrudRepository<User, Long>{

}