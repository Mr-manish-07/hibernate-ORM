package org.manish07.OneTOOne;

import jakarta.persistence.*;

@Entity
public class Answer {
    
    @Id
    private int id;
    
    private String answer;
    
    @ManyToOne
    private Question question;
    
    public Answer (int id, String answer, Question question) {
        this.id = id;
        this.answer = answer;
        this.question = question;
    }
    
    public Answer(){}
    
    public int getId () {
        return id;
    }
    
    public String getAnswer () {
        return answer;
    }
    
    public Question getQuestion () {
        return question;
    }
    
    public void setId (int id) {
        this.id = id;
    }
    public void setAnswer (String answer) {
        this.answer = answer;
    }
    
    public void setQuestion (Question question) {
        this.question = question;
    }
}