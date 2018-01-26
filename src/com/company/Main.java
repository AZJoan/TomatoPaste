package com.company;

public class Main {

    public static void main(String[] args) {

        CheckingAcct checking = new CheckingAcct(0);
        SavingsAcct savings = new SavingsAcct(0);

        checking.Deposit(500.0);
        savings.Deposit(500.0);

        savings.Withdraw(550.0);
        savings.CompoundInterest(.06);

        checking.Withdraw(550.0);

    }
}
