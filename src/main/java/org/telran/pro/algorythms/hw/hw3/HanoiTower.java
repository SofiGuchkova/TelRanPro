package org.telran.pro.algorythms.hw.hw3;

public class HanoiTower {


    void HanoiTowerSolve(int n, String mainTower, String goalTower, String helpTower) {
        if (n == 1) {
            System.out.println("Move from " + mainTower + " to " + goalTower);
        } else {
            HanoiTowerSolve(n-1, mainTower, helpTower, goalTower);
            System.out.println("Move from " + mainTower + " to " + goalTower);
            HanoiTowerSolve(n-1, helpTower, goalTower, mainTower);
        }
    }
}