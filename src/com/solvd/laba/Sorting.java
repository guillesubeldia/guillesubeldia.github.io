package com.solvd.laba;

import java.util.Scanner;
import java.util.Arrays;

public class Sorting {
    private int[] arrA;

    public static void main(String args[]) {
        int length;
        //asking for the type of sort
        System.out.println("What type of sorting want to do ?");
        Scanner sortType = new Scanner(System.in);
        String sort = sortType.nextLine();

        System.out.println("How many numbers want to sort?");
        Scanner arrayLen = new Scanner(System.in);
        length = arrayLen.nextInt();
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Enter the number " + (i + 1));
            numbers[i] = arrayLen.nextInt();
        }
        System.out.println("This is the list of numbers: " + Arrays.toString(numbers));
        if (sort.equals("bubble")) {
            bubbleSort(numbers, numbers.length);
            Sorting newArray = new Sorting();
            System.out.println("BUBBLE -> This is the ordered list of numbers: " + Arrays.toString(numbers));
        } else if (sort.equals("quicksort")) {
            quickSort(numbers, 0, numbers.length - 1);
            System.out.println("QUICKSORT -> This is the ORDERED list of numbers: " + Arrays.toString(numbers));
        } else {
            System.out.println("I just know bubble and quicksort :(");
        }
    }

    public static void bubbleSort(int numbers[], int n) {
        if (n == 1) {
            return;
        }
        for (int i = 0; i < n - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                int temp = numbers[i];
                numbers[i] = numbers[i + 1];
                numbers[i + 1] = temp;
            }
        }
        bubbleSort(numbers, n - 1);
    }

    public static void quickSort(int numbers[], int left, int right) {
        int pivot = numbers[left];
        int i = left;
        int j = right;
        int aux;
        while (i < j) {
            while (numbers[i] <= pivot && i < j) i++;

            while (numbers[j] > pivot) j--;

            if (i < j) {
                aux = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = aux;
            }
        }
        numbers[left] = numbers[j];
        numbers[j] = pivot;
        if (left < j - 1) quickSort(numbers, left, j - 1);
        if (j + 1 < right) quickSort(numbers, j + 1, right);
    }
}