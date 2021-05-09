package com.test.factory.builder.v2;

public class Course {
    private String video;
    private String ppt;
    private String article;

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getPpt() {
        return ppt;
    }

    public void setPpt(String ppt) {
        this.ppt = ppt;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    @Override
    public String toString() {
        return "Course{" +
                "video='" + video + '\'' +
                ", ppt='" + ppt + '\'' +
                ", article='" + article + '\'' +
                '}';
    }

    public Course(CourseBuilder courseBuilder) {
        this.video = courseBuilder.video;
        this.ppt = courseBuilder.ppt;
        this.article = courseBuilder.article;
    }

    public static class CourseBuilder{

        private String video;
        private String ppt;
        private String article;

        public CourseBuilder buildVideo(String video){
            this.video = video;
            return this;
        }
        public CourseBuilder buildPPT(String ppt){
            this.ppt = ppt;
            return this;
        }
        public CourseBuilder buildArticle(String article){
            this.article = article;
            return this;
        }

        public Course build(){
            return new Course(this);
        }

    }
}
