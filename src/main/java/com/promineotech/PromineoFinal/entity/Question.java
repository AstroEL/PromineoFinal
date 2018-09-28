package com.promineotech.PromineoFinal.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Question {
	
	private Long id;
	private String questionData;
	private String answerData;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public String getQuestionData() {
		return questionData;
	}

	public void setQuestionData(String questionData) {
		this.questionData = questionData;
	}

	public String getAnswerData() {
		return answerData;
	}

	public void setAnswerData(String answerData) {
		this.answerData = answerData;
	}
	

}
