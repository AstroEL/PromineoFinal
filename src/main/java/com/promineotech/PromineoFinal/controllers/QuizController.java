package com.promineotech.PromineoFinal.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.promineotech.PromineoFinal.entity.Quiz;
import com.promineotech.PromineoFinal.service.QuizService;

@RestController
public class QuizController {
	
	@Autowired
	QuizService service;
	
	//Retrieve all quizzes
	@RequestMapping("/quizzes")
	public Iterable<Quiz> getQuizzes() {
		return service.getQuizzes();
	}
	
	
}
