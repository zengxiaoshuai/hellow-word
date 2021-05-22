package com.test.flyweight;

/**
 *
 * 享元模式
 *
 */
public class Test {

    public static String departMents[] ={"A","B","C","D"};

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            String departMent = departMents[(int) (Math.random() * departMents.length)];

            Manager manager = (Manager) EmployeeFactory.getManager(departMent);

            manager.report();

        }


    }

}
