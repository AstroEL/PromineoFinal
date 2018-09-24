package com.promineotech.mvnProject.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionsController {

	List<String> questions = new ArrayList<String>();

	@RequestMapping(value = "/questions", method = RequestMethod.POST)
	public String addQuestion(@RequestBody String question) {
		questions.add(question);
		return "Sucessfully added:" + question;
	}

	@RequestMapping("/questions")
	public List<String> getQuestions() {
		return questions;
	}

}
