package com.test.observer;

/**
 *
 * 观察者模式
 *
 */
public class Test {

    public static void main(String[] args) {
        Course course = new Course("java设计模式");
        Teacher teacher = new Teacher("李四");
        Teacher teacher1 = new Teacher("王五");
        course.addObserver(teacher);

        course.addObserver(teacher1);
        Question question = new Question();
        question.setName("小明");
        question.setCourseQuestion("什么鬼");
        course.produceQuestion(course,question);

    }

}
