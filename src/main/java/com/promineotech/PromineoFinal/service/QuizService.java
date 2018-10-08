package com.promineotech.PromineoFinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promineotech.PromineoFinal.entity.Quiz;
import com.promineotech.PromineoFinal.repository.QuizRepository;

@Service
public class QuizService {
	
	@Autowired
	QuizRepository repo;
	
	public Quiz getQuiz() {
		return repo.findOne(id);
	}
	
}
