package com.test.bridge;

/**
 *
 * 桥接模式
 *
 */
public class Test {

    public static void main(String[] args) {

        Bank bank = new ABCBank(new SaveAccount());
        Account account = bank.openAccount();
        account.showAccountType();

        Bank bank1 = new ABCBank(new DepositAccount());
        Account account1 = bank1.openAccount();
        account1.showAccountType();

        Bank bank2 = new ICBCBank(new DepositAccount());
        Account account2 = bank2.openAccount();
        account2.showAccountType();

    }

}
