package com.test.bridge;

public class SaveAccount implements Account {
    @Override
    public Account openAccount() {

        System.out.println("打开活期账号");

        return new SaveAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个活期账号");
    }
}
