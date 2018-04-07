package com.corejava.assignments.spring.sampleapplication;

import java.util.Iterator;
import java.util.List;

public class QuestionListObjectSetterInjection {
    private int id;
    private String name;
    private List<AnswerSetter> answers;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<AnswerSetter> getAnswers() {
        return answers;
    }

    public void setAnswers(List<AnswerSetter> answers) {
        this.answers = answers;
    }

    public void displayInfo(){
        System.out.println(id+" "+name);
        System.out.println("answers are:");
        Iterator<AnswerSetter> itr = answers.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
