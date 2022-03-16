package com.solvd.laba.inheritance;


import java.util.Scanner;

public class SortingModes {

    public static void main(String[] args) {
        Scanner scanInt = new Scanner(System.in);

        System.out.println("Sorting pick 1 bubble / 2 quick sort: ");
        int sortingMode = scanInt.nextInt();
        System.out.println("Sorting Type data 1 String / 2 Int: ");
        int sortingType = scanInt.nextInt();
        System.out.println("Sorting 1 ASC / 2 DSC: ");
        int order = scanInt.nextInt();

        Menu m = new Menu();
        m.constructorDatos(sortingMode, sortingType, order);
    }
}
