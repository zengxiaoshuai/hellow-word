package com.test.observer;

import java.util.Observable;
import java.util.Observer;

public class Teacher implements Observer {

    private String teacherName;

    public Teacher(String teacherName) {
        this.teacherName = teacherName;
    }

    @Override
    public void update(Observable o, Object arg) {
        Course course = (Course) o;
        Question question = (Question) arg;

        System.out.println(teacherName+"老师收到了"+question.getName() +"在"+course.getCourseName()+"提出了一个"+question.getCourseQuestion()+"问题");
    }
}
