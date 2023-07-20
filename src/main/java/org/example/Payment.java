package org.example;

public class Payment {

    private int amount;

    public Payment(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public int chargeAmount(int amount) { // 충전

        return this.amount += amount;
    }
}
