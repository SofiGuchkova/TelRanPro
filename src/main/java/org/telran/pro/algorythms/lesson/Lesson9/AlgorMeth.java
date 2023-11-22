package org.telran.pro.algorythms.lesson.Lesson9;

public class AlgorMeth {

    void sortedArray() {
        // v
        // 1 1 2 3 0 1 2 3 0 0 0 0 1 1
        //   ^

    int[] arrNotSort = new int[]{0, 1, 2, 3, 2, 1, 3, 0, 1, 2, 3, 0, 0, 0, 0, 1, 1};
    int i = 0;
    int j = 1;

    while (i<arrNotSort.length) {
        if (arrNotSort[i] !=0) {
            if (i != j) {
                int temp = arrNotSort[j];
                arrNotSort[j] = arrNotSort [i];
                arrNotSort[i] = temp;
                i++;
            }
            j++;
        }
        }

    }



      }





