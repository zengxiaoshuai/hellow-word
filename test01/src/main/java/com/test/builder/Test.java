package com.test.builder;

public class Test {
    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseRealBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);
        Course course = coach.makeCourse("javaVideo", "javaPPT", "javaArticle");
        System.out.println(course);
    }
}
