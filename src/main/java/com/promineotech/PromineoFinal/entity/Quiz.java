package com.promineotech.PromineoFinal.entity;


import java.util.Set;

import javax.persistence.*;


@Entity
public class Quiz {
    
    private Long id;
    private String name;
    private Set<String> quizzes;

    
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
    @JoinTable(name = "user", 
                joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"), 
                inverseJoinColumns = @JoinColumn(name = "question_id", referencedColumnName = "id"))

    public Set<String> getQuizzes() {
        return quizzes;
    }

    public void setQuizzes(Set<String> quizzes) {
        this.quizzes = quizzes;
    }
    
    

}
