package com.test.factory.builder;

public class CourseRealBuilder extends CourseBuilder {
    private Course course = new Course();
    @Override
    public void buileVideo(String video) {
        course.setVideo(video);
    }

    @Override
    public void builePpt(String ppt) {
        course.setPpt(ppt);
    }

    @Override
    public void buileArticle(String article) {
        course.setArticle(article);
    }

    @Override
    public Course makeCourse() {
        return course;
    }
}
