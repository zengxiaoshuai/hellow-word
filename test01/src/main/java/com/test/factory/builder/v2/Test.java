package com.test.factory.builder.v2;

public class Test {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().buildVideo("javaVideo").buildArticle("javaArticle").buildPPT("javaPPT").build();

        System.out.println(course);

    }
}
