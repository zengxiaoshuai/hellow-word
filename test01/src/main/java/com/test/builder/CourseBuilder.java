package com.test.builder;

public abstract class CourseBuilder {
    /*private String video;
    private String ppt;
    private String article;*/
    public abstract void buileVideo(String video);
    public abstract void builePpt(String ppt);
    public abstract void buileArticle(String article);

    public abstract Course makeCourse();
}
