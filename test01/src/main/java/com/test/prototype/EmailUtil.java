package com.test.prototype;

import java.text.MessageFormat;

public class EmailUtil {
    public static void sendMail(Email mail){
        String outputContent = "向{0}同学,邮件地址:{1},邮件内容:{2}发送邮件成功";
        System.out.println(MessageFormat.format(outputContent,mail.getName(),mail.getEmailAddress(),mail.getContent()));
    }
    public static void saveOriginMailRecord(Email mail){
        System.out.println("存储originMail记录,originMail:"+mail.getContent());
    }
}
