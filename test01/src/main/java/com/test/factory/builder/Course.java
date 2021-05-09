package com.test.factory.builder;

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
}
