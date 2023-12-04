package org.telran.pro.javapro.hw.HW3;
import java.util.Scanner;

public class BankApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

     ATM alphaBankAtm = new AlphaBank("AlphaBank" ,2000," USD ");
     ATM generalBankAtm = new GeneralBank("GeneralBank ",5000," USD ");
     ATM reifeizenBankAtm = new ReifeizenBank("ReifeizenBank ", 8000,  " USD ");
     ATM reifeizenBankAtmTwo = new ReifeizenBank("GeneralBank ", 5000, " USD ");
     CreditCard creditCard = new CreditCard(2134876, 5532, 9000, " EUR ");
     ATM [] atms = {alphaBankAtm, reifeizenBankAtmTwo, generalBankAtm, reifeizenBankAtm};

     for (ATM atm : atms){

         if (atm instanceof Converted){

             System.out.println("Введите пин");
             int cashWithDraw = atm.pinCheck(creditCard, scanner.nextInt());
             int convertedSum = ((Converted) atm).convertEurToUsd(cashWithDraw);
             atm.cashWithDraw(creditCard, convertedSum, atm.getAvailableSum(), cashWithDraw);
         }
     }
    }
}
