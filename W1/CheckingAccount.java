package com.example.W1;

/**
 * Created by Jiang Jinjing on 2017/9/25.
 */

public class CheckingAccount extends Account{

    CheckingAccount(){
        super();
    }
    CheckingAccount(int id, double balance){
        super(id,balance);
    }

    @Override
    void withdraw(double amount) {
        super.setBalance(getBalance()-amount);
        if(super.getBalance()<-5000){
            System.out.println("over limit");
            super.setBalance(-5000);
        }
    }
}
