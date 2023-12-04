package org.telran.pro.javapro.hw.HW3;

import java.util.Scanner;

public abstract class ATM {

  Scanner scanner = new Scanner(System.in);
  int i;
  private int availableSum;
  private String currency;

  ATM(String name, int availableSum, String currency) {

      this.availableSum = availableSum;
      this.currency = currency;
  }

  public int getAvailableSum() {
        return this.availableSum;
    }

 void cashWithDraw(CreditCard creditCard, int withDrawSum, int availableSum, int sumInEur) {

      if (creditCard.getAvailableSum() >= withDrawSum && availableSum >= withDrawSum) {
          System.out.println("Снимаем с вашей карты: " + withDrawSum + " " + currency);
          creditCard.setAvailableSum(creditCard.getAvailableSum() - sumInEur);
          availableSum = this.availableSum - withDrawSum;
          System.out.println("Остаток на карте: " + creditCard.getAvailableSum() + " " + creditCard.getCurrency());
          System.out.println("В банкомате осталось " + availableSum + " " + currency);

     } else {
         System.out.println("Ошибка. Сумма на карте : " + creditCard.getAvailableSum() + " " + creditCard.getCurrency());
         System.out.println("В банкомате доступно: " + this.availableSum + " " + currency);
     }
 }
  public int pinCheck(CreditCard creditCard, int pin) {
      for (i = 3; i > 0; i--) {
          if (pin == creditCard.getPin()) {
              System.out.println("Авторизация прошла успешно");
              System.out.println("Введите сумму для снятия наличных");
              return scanner.nextInt();

          } else if (i == 1) {
              System.out.println("Вы ввели неправильно пин-код 3 раза. Ваша карта заблокирована. Для разблокировки обратитесь в ваш банк");
          } else System.out.println("Пин-код введен неверно, повторите");
          pin = scanner.nextInt();

      }
      return 0;
  }
}



