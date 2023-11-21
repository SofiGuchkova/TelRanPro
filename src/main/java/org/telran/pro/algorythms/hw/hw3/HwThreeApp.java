package org.telran.pro.algorythms.hw.hw3;

//Ответ:
//
public class HwThreeApp {
    public static void main(String[] args) {
        Fibonach varFib = new Fibonach();
        HanoiTower hanoiTower = new HanoiTower();

        // Рекурсия

        //Для 30 вызовов - ???
        //Для 20 вызовов совершено 21896 операций. 1.65^n
        //Для 10 вызовов совершено 179 операций = 1.67^n
        //Вывод: Чем больше входных данных, тем дольше работает программа.
        //Применять рекурсивный метод для вычисления Фибоначи очень затратно = много операций

        for(int i = 0; i < varFib.getN(); i++) {
            System.out.println("Число " + varFib.getFibRec(i));
        }

        // Итерация
        // Прямая зависимость по времени O(n) . 30 вызовов = 30 итераций. 20 вызовов = 20 итераций.
        // Вывод - Итеративный метод для вычисления чисел Фибоначи работает намного быстрее с большим количеством данных,
        // чем рекурсивный

          varFib.getFibIte(30);


          // Ханойская башня
        hanoiTower.HanoiTowerSolve(3,"First Tower ", "Third Tower ", "Second Tower ");

        }
    }

