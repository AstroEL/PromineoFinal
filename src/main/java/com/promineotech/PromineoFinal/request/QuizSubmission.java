package com.promineotech.PromineoFinal.request;

	 import java.util.Set;
	 import com.promineotech.PromineoFinal.entity.Answer;
	
	 public class QuizSubmission {
		
		private Set<Answer> answers;
	 	public Set<Answer> getAnswers() {
			return answers;
		}
	 	public void setAnswers(Set<Answer> answers) {
			this.answers = answers;
		}
	 }


