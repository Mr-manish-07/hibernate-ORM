package org.manish07.OneTOOne;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Question {
    
    @Idz > (x > y ? x : y) ? z : ((x > y) ? x : y)
    @Column(name = "q_id")
    private int id;
    
    private String question;
    
    @OneToMany(mappedBy = "question")
    private List<Answer> answer;
    
    public Question (int id, String question) {
        this.id = id;
        this.question = question;
    }
    
    public Question() {}
    
    public int getId () {
        return id;
    }
    
    public String getQuestion () {
        return question;
    }
    
    public void setId (int id) {
        this.id = id;
    }
    
    public void setQuestion (String question) {
        this.question = question;
    }
    
    public List<Answer> getAnswer () {
        return answer;
    }
    public void setAnswer (List<Answer> answer) {
        this.answer = answer;
    }
}