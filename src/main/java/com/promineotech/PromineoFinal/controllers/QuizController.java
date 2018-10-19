package com.promineotech.PromineoFinal.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.promineotech.PromineoFinal.entity.Quiz;
import com.promineotech.PromineoFinal.request.QuizSubmission;
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
    
       
    @RequestMapping("/quizzes/{id}")
    public Quiz getQuizById(@PathVariable Long id) {
    	return service.getQuiz(id);
    }
    
    @RequestMapping(value="/quizzes/{id}", method=RequestMethod.PUT)
    public Quiz updateQuiz(@PathVariable Long id, @RequestBody Quiz quiz) {
    	return service.updateQuiz(id, quiz);
    }
    
    @RequestMapping(value="/quizzes/{id}", method=RequestMethod.DELETE)
    public void deleteQuiz(@PathVariable Long id) {
    	service.deleteQuiz(id);
    }
    
    @RequestMapping("/quizzes/{id}/take")
    public double takeQuiz(@PathVariable Long id, @RequestBody QuizSubmission submission) {
    	return service.gradeQuiz(id, submission);
    }
    
}