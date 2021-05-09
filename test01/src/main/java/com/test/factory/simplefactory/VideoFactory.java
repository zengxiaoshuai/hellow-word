package com.test.factory.simplefactory;

public class VideoFactory {
    public Video getVideo(String videoType){
        if ("java".equals(videoType)){
            return new JavaVideo();
        }else if ("python".equals(videoType)){
            return new PythonVideo();
        }
        return null;
    }
}
