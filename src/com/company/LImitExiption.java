package com.company;

public class LImitExiption extends Exception {
   private double remainingAmount;

    public LImitExiption(String message, double remainingAmount) {
        super(message);
        this.remainingAmount = remainingAmount;
    }

    public double getRemainingAmount() {
        return remainingAmount;
    }
}

