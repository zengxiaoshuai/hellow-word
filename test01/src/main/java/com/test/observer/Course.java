package com.test.observer;

import java.util.Observable;

public class Course extends Observable {

    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void produceQuestion(Course course,Question question){

        System.out.println(question.getName() +"在"+course.getCourseName() + "课上提交了一个问题 ");

        setChanged();

        notifyObservers(question);
    }
}
