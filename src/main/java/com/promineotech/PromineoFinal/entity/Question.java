package com.promineotech.PromineoFinal.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Question {
	
	private Long id;
	private String questionData;
	private String answerData;
	private Set<Quiz> quizzes;
	
	
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

	@OneToMany(mappedBy = "questions")
	public Set<Quiz> getQuizzes() {
		return quizzes;
	}

	public void setQuizzes(Set<Quiz> quizzes) {
		this.quizzes = quizzes;
	}
	

}
