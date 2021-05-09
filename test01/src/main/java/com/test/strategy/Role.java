package com.test.strategy;

public class Role {

    protected IAttackBehavior iAttackBehavior;

    protected IDefendBehavior  iDefendBehavior;

    protected RunBehavior runBehavior;

    public Role setIAttackBehavior(IAttackBehavior iAttackBehavior){
        this.iAttackBehavior = iAttackBehavior;
        return this;
    }
    public Role setiDefendBehavior(IDefendBehavior  iDefendBehavior){
        this.iDefendBehavior = iDefendBehavior;
        return this;
    }
    public Role setrunBehavior(RunBehavior runBehavior){
        this.runBehavior = runBehavior;
        return this;
    }
    protected void run()
    {
        runBehavior.run();
    }

    protected void attack()
    {
        iAttackBehavior.attack();
    }
    protected void defend()
    {
        iDefendBehavior.defend();
    }

}
