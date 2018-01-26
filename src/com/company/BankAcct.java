package com.company;

import java.text.NumberFormat;

public class BankAcct {
    public double balance;
    NumberFormat formatBal = NumberFormat.getCurrencyInstance();

    public BankAcct(double balance) {
        this.balance = balance;
    }

    public void Withdraw(double value) {
        this.balance -= value;
        System.out.println(formatBal.format(value) + " was withdrawn and the new balance is " +
                formatBal.format(this.balance));
    }

    public void Deposit(double value) {
        this.balance += value;
        System.out.println(formatBal.format(value) + " was deposited and the new balance is " +
                formatBal.format(this.balance));
    }

}
