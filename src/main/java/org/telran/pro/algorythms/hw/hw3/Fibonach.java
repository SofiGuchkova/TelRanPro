package org.telran.pro.algorythms.hw.hw3;


public class Fibonach {


//Переменная для вовда рекурсивного метода
private final int n = 20;

    public int getN() {

        return n;
    }

    // Рекурсивная
    int  getFibRec (int n){
        if(n <= 1) {
            return n;
        }
        return getFibRec(n-1) + getFibRec(n-2);
    }
    // Итеративная
    void getFibIte(int n){
        int i = 2;
        int [] arrFib = new int[n];
        while(i<n){
            arrFib[1] = 1;
            arrFib[0] = 0;
            arrFib[i] = arrFib[i-1] + arrFib[i-2];
            System.out.println(arrFib[i]);
            i++;

        }
    }

}

