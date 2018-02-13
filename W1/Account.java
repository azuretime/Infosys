package com.example.W1;

import java.util.Date;

/**
 * Created by Jiang Jinjing on 2017/9/13.
 */

public class Account {
    private int id;
    private double balance;
    private static double annualInterestRate;//data
    private Date dateCreated = new Date();

    //constructor

    Account(){
        id = 0;
        balance = 0;
        annualInterestRate = 0;
    }
    Account(int newId, double newBalance){
        id = newId;
        balance = newBalance;
    }

    int getId() {
        return id;
    }
    double getBalance() {
        return balance;
    }
    double getAnnualInterestRate() {
        return annualInterestRate;
    }
    void setId(int newId) {
        id = newId;
    }
    void setBalance(double newBalance) {
        balance = newBalance;
    }
    static void setAnnualInterestRate(double newAnnualInterestRate) {
        annualInterestRate = newAnnualInterestRate;
    }

    Date getDateCreated() {
        return dateCreated;
    }

    double getMonthlyInterestRate() {
        return annualInterestRate/12/100;
    }

    double getMonthlyInterest() {
        return annualInterestRate/12/100*balance;
    }

    void withdraw(double amount) {
         balance -= amount;
    }

    void deposit(double amount) {
        balance += amount;
    }


}


/*
Expected output

Balance is 20500.0
Monthly interest is 76.875

*/



