package com.example.W1;

/**
 * Created by Jiang Jinjing on 2017/9/13.
 */

public class TestAccount {

    public static void main (String[] args) {
        Account account = new Account(1122, 20000);
        Account.setAnnualInterestRate(4.5);

        account.withdraw(2500);
        account.deposit(3000);
        System.out.println("Balance is " + account.getBalance());
        System.out.println("Monthly interest is " + account.getMonthlyInterest());
        System.out.println("Date is " + account.getDateCreated());
    }
}
