package org.telran.pro.javapro.hw.HW2;

public class Phone {

   private String phoneName;

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }
    void call(int phoneNumberToCall) {
        System.out.println("Try to make a call to number " + phoneNumberToCall);

    }
    void receiveCall(int phoneNumberIncome){
        System.out.println("Try to receive a call from number " + phoneNumberIncome);
    }
}
