package org.telran.pro.javapro.hw.HW3;

public class GeneralBank extends ATM implements Converted{

    GeneralBank(String name, int availableSum, String currency) {
        super(name, availableSum, currency);
    }

    @Override
    public int convertEurToUsd(int currencySum) {
        return (int) (1.15 * currencySum);
    }
}
