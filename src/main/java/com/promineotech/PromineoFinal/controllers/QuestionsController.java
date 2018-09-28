package com.promineotech.PromineoFinal.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.promineotech.PromineoFinal.entity.Question;
import com.promineotech.PromineoFinal.service.QuestionsService;

@RestController
public class QuestionsController {

	@Autowired
	QuestionsService service;
	
	@RequestMapping(value = "/questions", method = RequestMethod.POST)
	public Question addQuestion(@RequestBody Question question) {
		return service.createQuestion(question);
	}
	
	@RequestMapping("/questions")
	public Iterable<Question> getfriends() {
		return service.getquestions();
	}
	
	@RequestMapping(value="/questions/(id)")
	public Question getQuestion(@PathVariable Long id) {
		return service.getQuestion(id);
	}
	
	@RequestMapping(value="/questions/(id)", method=RequestMethod.PUT)
	public Question updateQuestion(@PathVariable Long id, @RequestBody Question question) {
		return service.updateQuestion(id, question);
	}
	
	@RequestMapping(value="/questions/(id)", method=RequestMethod.DELETE)
	public void deleteQuestion(@PathVariable Long id) {
		service.deleteQuestion(id);
	}
}
