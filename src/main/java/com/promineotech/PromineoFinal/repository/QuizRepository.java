package com.promineotech.PromineoFinal.repository;

import org.springframework.data.repository.CrudRepository;

import com.promineotech.PromineoFinal.entity.Quiz;

public interface QuizRepository extends CrudRepository<Quiz, Long>{
	
	Iterable<Quiz> findQuizzesByUserId(Long userid);
}
