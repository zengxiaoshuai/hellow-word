package com.test.builder;

public class Coach {
    private CourseBuilder courseBuilder;

    public void setCourseBuilder(CourseBuilder courseBuilder) {
        this.courseBuilder = courseBuilder;
    }

    public Course makeCourse(String video,String ppt,String article){
        courseBuilder.buileVideo(video);
        courseBuilder.builePpt(ppt);
        courseBuilder.buileArticle(article);
        return courseBuilder.makeCourse();
    }
}
