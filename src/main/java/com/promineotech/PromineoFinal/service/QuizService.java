package com.promineotech.PromineoFinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promineotech.PromineoFinal.entity.Quiz;
import com.promineotech.PromineoFinal.repository.QuizRepository;

@Service
public class QuizService {
	
	@Autowired
	QuizRepository repo;
	
	public Quiz getQuiz(Long id) {
		return repo.findOne(id);
	}
	
	
	public Iterable<Quiz> getQuizzes(){
		return repo.findAll();
	}
	
	public void deleteQuiz(Long id) {
		repo.delete(id);
	}
	
	public Quiz updateQuiz(Long id, Quiz quiz) {
		Quiz foundQuiz = repo.findOne(id);
		if (foundQuiz != null) {
			foundQuiz.setName(quiz.getName());
			foundQuiz.setQuizzes(quiz.getQuizzes());
			repo.save(foundQuiz);
			
		}
		return foundQuiz;
	}
	
	public Quiz createQuiz(Quiz quiz) {
		return repo.save(quiz);
	}
}
