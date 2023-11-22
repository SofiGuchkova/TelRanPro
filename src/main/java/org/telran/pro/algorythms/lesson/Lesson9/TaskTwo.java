package org.telran.pro.algorythms.lesson.Lesson9;

public class TaskTwo {
    //дан массив чисел (неупорядоченных)
    //
    //1,0,2,3,6,4,5,9,8,11,15
    //
    //0,1,2,3,4,5,6,9,11,12
    //нужно создать строку с указанием ренжей
    //"0-6,9,11-12"
  int i = 0;
  int j;
  int start;
  int stop;
  int [] arr = new int[] {0,1,2,3,4,5,6,9,11,12};
  void getString() {

      for(i = 0; i == 1; i++) {
          if (arr[i] == arr[i+1] - 1){
              arr[i] = start;
              }

         for (j = 0; j<arr.length; j++) {
             if (arr[j+1] != arr[j] + 1){
                 arr[j] = stop;
             }

         }


      }
      System.out.println("Старт + " + start);
      System.out.println("Стоп + " + stop);
  }
}
