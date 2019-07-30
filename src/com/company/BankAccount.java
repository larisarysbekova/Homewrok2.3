package com.company;

public class BankAccount extends Exception{
    double wallet;

    public double getAmount() {
        return wallet;
    }

    public void deposit(double sum) {
        wallet = wallet + sum;
        System.out.println("Сумма на вашем счете:" + wallet + " Сом");

    }
    public void  withDraw(double sum) throws LImitExiption{
        wallet = wallet - sum;
        if (wallet < 0){
            throw new LImitExiption(" У вас недостаточно средств на счету",wallet);
        }

    }
}
