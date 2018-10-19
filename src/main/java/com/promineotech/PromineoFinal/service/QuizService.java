package com.promineotech.PromineoFinal.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promineotech.PromineoFinal.entity.Answer;
import com.promineotech.PromineoFinal.entity.Question;
import com.promineotech.PromineoFinal.entity.Quiz;
import com.promineotech.PromineoFinal.repository.QuizRepository;
import com.promineotech.PromineoFinal.request.QuizSubmission;

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
			foundQuiz.setQuestions(quiz.getQuestions());
			repo.save(foundQuiz);
			
		}
		return foundQuiz;
	}
	
	public Quiz createQuiz(Quiz quiz) {
		return repo.save(quiz);
	}
	
	public Iterable<Quiz> getQuizzesByUserId(Long id) {
		return repo.findQuizzesByUserId(id);
	}


	public double gradeQuiz(Long id, QuizSubmission submission) {
		Set<Question> questions = repo.findOne(id).getQuestions();
		double score = 0;
		for (Question question : questions) {
			for (Answer answer : submission.getAnswers()) {
				if (answer.getId().equals(question.getId())) {
					if (answer.getData().toLowerCase().equals(question.getAnswerData().toLowerCase())) {
						score++;
					}
					break;
				}
			}
		}
		return (score / questions.size()) * 100;
	}
}
