package com.promineotech.PromineoFinal.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.promineotech.PromineoFinal.entity.Quiz;
import com.promineotech.PromineoFinal.service.QuizService;


@RestController //says this is a component
public class QuizController {
    
    
	@Autowired
	QuizService service;
	
    @RequestMapping(value="/quizzes", method=RequestMethod.POST)
    public Quiz addQuiz(@RequestBody Quiz quiz) {
        return service.createQuiz(quiz);
    }
    
    // retrieves all quizzes
    @RequestMapping("/quizzes")
    public Iterable<Quiz> getQuizzes() {
        return service.getQuizzes();
    }
    
    
    
}