package com.promineotech.PromineoFinal.entity;


import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Quiz {
    
    private Long id;
    private String name;
    private Set<Question> questions;

    
    @JsonIgnore
    private User user;
    
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

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
        })
   
    @JoinTable(name = "quiz_questions", 
                joinColumns = @JoinColumn(name = "question_id", referencedColumnName = "id"), 
                inverseJoinColumns = @JoinColumn(name = "quiz_id", referencedColumnName = "id"))

	
	public Set<Question> getQuestions() {
		return questions;
	}
	
	public void setQuestions(Set<Question> quizzes) {
        this.questions = quizzes;
    }
	
	@ManyToOne
	@JoinColumn(name="userId")
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
  
  
    
}