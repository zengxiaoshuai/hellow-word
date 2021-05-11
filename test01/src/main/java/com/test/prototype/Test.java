package com.test.prototype;

/**
 * 关于原型模式个人见解：
 *      需要创建多个重复对象可以考虑使用原型模式，使用原型模式一定要注意类里面的引用类型是否需要用到深克隆
 */
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
