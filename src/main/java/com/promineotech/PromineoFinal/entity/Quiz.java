package com.promineotech.PromineoFinal.entity;

import java.util.Set;

import javax.persistence.*;


@Entity
public class Quiz {
	
	private Long id;
	private String name;
	private Set<Quiz> quizzes;

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@ManyToMany()
    @JoinTable(name = "user", 
    			joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"), 
    			inverseJoinColumns = @JoinColumn(name = "question_id", referencedColumnName = "id"))

	public Set<Quiz> getQuizzes() {
		return quizzes;
	}

	public void setQuizzes(Set<Quiz> quizzes) {
		this.quizzes = quizzes;
	}
	
	

}
