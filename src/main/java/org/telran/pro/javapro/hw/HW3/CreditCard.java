package org.telran.pro.javapro.hw.HW3;

public class CreditCard {

    private int cardNumber;
    private int pin;
    private int availableSum;
    private String currency;

    CreditCard (int cardNumber,int pin, int availableSum, String currency){

        this.cardNumber = cardNumber;
        this.pin = pin;
        this.availableSum = availableSum;
        this.currency = currency;
    }

    public void setAvailableSum(int availableSum) {
        this.availableSum = availableSum;
    }

    public int getPin() {
        return pin;
    }

    public int getAvailableSum() {
        return availableSum;
    }

    public String getCurrency() {
        return currency;
    }
}
