package com.test.prototype;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Email email = new Email();
        email.setContent("初始化模板");
        System.out.println("初始化mail:"+email);
        for(int i = 0;i < 10;i++){
            Email mailTemp = (Email) email.clone();
            mailTemp.setName("姓名"+i);
            mailTemp.setEmailAddress("姓名"+i+"@imooc.com");
            mailTemp.setContent("恭喜您，此次慕课网活动中奖了");
            EmailUtil.sendMail(mailTemp);
            System.out.println("克隆的mailTemp:"+mailTemp);
        }
        EmailUtil.saveOriginMailRecord(email);
    }
}
