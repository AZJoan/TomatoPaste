package com.company;

public class SavingsAcct extends BankAcct {

    public SavingsAcct(double balance) {
        super(balance);
    }

    @Override
    public void Withdraw(double value) {
        double checkbal = this.balance - value;
        if (checkbal > 0) {
            this.balance -= value;
        }
    }

    public void CompoundInterest(double value) {
        double interest = this.balance * value;
        this.balance += interest;
        System.out.println("Compound Interest of " + value + "% increased the balance to "
                + formatBal.format(this.balance));
    }
}
