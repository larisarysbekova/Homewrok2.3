package com.company;



public class Main {

    public static void main(String[] args)throws Exception{

        BankAccount bank = new BankAccount();

        bank.deposit(10000);

        while (true) {
            bank.withDraw(6000);

        }

    }
}

