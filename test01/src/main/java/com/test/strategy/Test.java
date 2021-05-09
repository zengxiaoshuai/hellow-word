package com.test.strategy;

public class Test {
    public static void main(String[] args) {
        Role role = new Role();
        //role.setIAttackBehavior(new AttackJY()).setiDefendBehavior(new DefendTBS()).setrunBehavior(new RunJCTQ());
        role.setIAttackBehavior(new AttackXLSBZ()).setiDefendBehavior(new DefendTBS()).setrunBehavior(new RunJCTQ());
        role.run();
        role.attack();
        role.defend();
    }
}
