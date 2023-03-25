package com.ani.solid;

// Bad Example
abstract class BadAccount {
    protected abstract void deposit(double amt);
    protected abstract void withdraw(double amt);
}

class BadBakingWithdrawalService {

    private final BadAccount ac;

    public BadBakingWithdrawalService(BadAccount ac) {
        this.ac = ac;
    }

    public void withdraw(double amt) {
        ac.withdraw(amt);
    }
}

//Good Example
abstract class Account {
    protected abstract void deposit(double amt);
}

abstract class WithdrawableAccount extends Account { 
    protected abstract void withdraw(double amt);
}

class FixedAcount extends Account {

    @Override
    protected void deposit(double amt) {
        System.out.println("Deposited " + amt);
    }
}

class CurrentAccount extends WithdrawableAccount {

    @Override
    protected void withdraw(double amt) {
        System.out.println("Withdraw " + amt);
    }

    @Override
    protected void deposit(double amt) {
        System.out.println("Deposit " + amt);
    }
}

class BakingWithdrawalService {

    private final WithdrawableAccount ac;

    public BakingWithdrawalService(WithdrawableAccount ac) {
        this.ac = ac;
    }

    public void withdraw(double amt) {
        ac.withdraw(amt);
    }
}

public class Lsp {

    public static void main(String[] args) {
        
        Account fixedAc = new FixedAcount();
        fixedAc.deposit(100);

        WithdrawableAccount cac = new CurrentAccount();
        BakingWithdrawalService service = new BakingWithdrawalService(cac);
        service.withdraw(100);
    }
}
