package com.company;

public class CheckingAcct extends BankAcct {
    protected double ODFee = 10.0;

    public CheckingAcct(double balance) {
        super(balance);
    }

   @Override
   public void Withdraw(double value) {
      double checkbal = this.balance - value;
      if (checkbal > 0) {
          this.balance -= value;
      } else {
          this.balance -= value;
          this.balance -= ODFee;
          System.out.println("There were insufficient funds for the withdrawal. "
            + "An overdraft fee of " + formatBal.format(ODFee)
            + " was charged. The new balance is " + formatBal.format(this.balance));
      }
   }
}
