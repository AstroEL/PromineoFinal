package com.promineotech.PromineoFinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promineotech.PromineoFinal.entity.Question;
import com.promineotech.PromineoFinal.repository.QuestionRepository;

@Service
public class QuestionsService {
	
	@Autowired
	QuestionRepository repo;
	
	public Question getQuestion(Long id) {
		return repo.findOne(id);
	}
	
	public Iterable<Question> getquestions() {
		return repo.findAll();
	}
	
	public void deleteQuestion(Long id) {
		repo.delete(id);		
	}
	
	public Question updateQuestion(Long id, Question question) {
		Question foundQuestion = repo.findOne(id);
		if (foundQuestion != null) {
			foundQuestion.setQuestionData(question.getQuestionData());
			foundQuestion.setAnswerData(question.getAnswerData());
			repo.save(foundQuestion);		
		}
		return foundQuestion;
	}
	
	public Question createQuestion(Question question) {
		return repo.save(question);
	}
}

