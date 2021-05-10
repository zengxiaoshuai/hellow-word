package com.test.prototype.clone;

import java.util.Date;

public class Pig implements Cloneable{
    private String name;
    private Date birthday;

    public Pig(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}'+super.toString();
    }

   /* @Override
    protected Object clone() throws CloneNotSupportedException {
        Pig pig = (Pig)super.clone();

        //深克隆
        pig.birthday = (Date) pig.birthday.clone();
        return pig;
    }*/

    /**
     * 使用原型模式一定要注意里面的引用类型是否使用深克隆
     *      不然很容易出现bug
     */

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
