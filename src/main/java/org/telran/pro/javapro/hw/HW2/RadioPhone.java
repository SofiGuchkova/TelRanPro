package org.telran.pro.javapro.hw.HW2;

public class RadioPhone extends Phone{
    private int ownNumber = 44332211;

    public int getOwnNumber() {
        return ownNumber;
    }

    public void setOwnNumber(int ownNumber) {
        this.ownNumber = ownNumber;
    }
    @Override
    void call(int phoneNumberToCall) {
        System.out.println("The phone " + getPhoneName() + " " + ownNumber);
        super.call(phoneNumberToCall);
    }

    @Override
    void receiveCall(int phoneNumberIncome) {
        System.out.println("The phone "+ getPhoneName() + " " + ownNumber);
        super.receiveCall(phoneNumberIncome);
    }
}
