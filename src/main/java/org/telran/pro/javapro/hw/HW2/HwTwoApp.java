package org.telran.pro.javapro.hw.HW2;


import java.util.Random;


public class HwTwoApp {

    public static void main(String[] args) {
        Random random = new Random();

        ButtonPhone buttonPhone = new ButtonPhone();
        RadioPhone radioPhone = new RadioPhone();
        SmartPhone smartPhone = new SmartPhone();


        buttonPhone.call(random.nextInt(999999));
        System.out.println();
        buttonPhone.receiveCall(random.nextInt(999999));
        System.out.println();
        radioPhone.call(random.nextInt(999999));
        System.out.println();
        radioPhone.receiveCall(random.nextInt(9999999));
        System.out.println();
        smartPhone.call(random.nextInt(999999));
        System.out.println();
        smartPhone.receiveCall(random.nextInt(99999));

        // *

        Phone [] phones = {buttonPhone, radioPhone, smartPhone};
        System.out.println();
        System.out.println(" Пытаемся звонить с любого телефона по указанному номеру");
        makeStarCall(phones);
        System.out.println();
        System.out.println(" Пытаемся принять звонок на любой телефон с указанного номера");
        receiveStarCall(phones);
    }
    // *
   static void makeStarCall(Phone[] phones) {
       for (Phone phone : phones) {
           phone.call(12345);
       }
   }

       static void receiveStarCall(Phone[] phones) {
           for (Phone phone: phones) {
               phone.receiveCall(54321);
           }
    }
}

