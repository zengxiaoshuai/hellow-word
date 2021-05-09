package com.test.factory.simplefactory;

public class Test {
    public static void main(String[] args) {
        //基本版本
        /*VideoFactory videoFactory = new VideoFactory();
        Video java = videoFactory.getVideo("java");
        java.produce();*/

        //升级版
        VideoFactoryPlus videoFactoryPlus = new VideoFactoryPlus();
        Video video = videoFactoryPlus.getVideo(JavaVideo.class);
        video.produce();

    }
}
