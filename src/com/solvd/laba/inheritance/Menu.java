package com.solvd.laba.inheritance;

import java.util.Arrays;
import java.util.Random;
import java.util.Collections;
import java.util.ArrayList;

public class Menu {
    //Sorting mode selection
    private int sortingMode;
    //Ssorting type of data
    private int sortingType;
    //asc or desc
    private int order;
    //Actual array
    private int[] arrayInt = null;
    private String[] arrayString = null;

    //construct
    public void constructorDatos(int newSortingMode, int newSortingType, int newOrder) {
        sortingMode = newSortingMode;
        sortingType = newSortingType;
        order = newOrder;
        if (sortingType == 1) {
            //char
            arrayString = setArrayString();
        } else {
            //int
            arrayInt = setArrayInt();
        }

    }

    public int[] getData() {
        int[] arrayData = new int[3];
        arrayData[0] = sortingMode;
        arrayData[1] = sortingType;
        arrayData[2] = order;
        return arrayData;
    }

    public int[] setArrayInt() {
        int[] arrayNumbers = new int[5];
        for (int i = 0; i < arrayNumbers.length; i++) {
            arrayNumbers[i] = (int) (Math.random() * 28) + 1;
        }
        System.out.println("\nUnsorted INT Array: " + Arrays.toString(arrayNumbers));

        if (sortingMode == 1) {
            arrayNumbers = bubbleInt(arrayNumbers, arrayNumbers.length);
            if (order == 2) {
                ArrayList<Integer> temp = new ArrayList<>();
                for (int i : arrayNumbers) temp.add(i);
                Collections.reverse(temp);

                for (int i = 0; i < arrayNumbers.length; i++) {
                    arrayNumbers[i] = temp.get(i);
                }
            }
            System.out.println("\nSorted Array: " + Arrays.toString(arrayNumbers));
        }else{
            quickSortInt(arrayNumbers, 0, arrayNumbers.length - 1);
            if (order == 2) {
                ArrayList<Integer> temp = new ArrayList<>();
                for (int i : arrayNumbers) temp.add(i);
                Collections.reverse(temp);

                for (int i = 0; i < arrayNumbers.length; i++) {
                    arrayNumbers[i] = temp.get(i);
                }
            }
            System.out.println("\nQuick Sorted Array: " + Arrays.toString(arrayNumbers));
        }
        return arrayNumbers;
    }

    public String[] setArrayString() {
        String characters = "abcdefghijklmnopqrstuvwxyz";
        Random rand = new Random();
        String[] arrayString = new String[5];

        for (int i = 0; i < 5; i++) {
            arrayString[i] = String.valueOf(characters.charAt(rand.nextInt(characters.length())));
        }

        char[] arrayChar = new char[5];
        for (int i = 0; i < 5; i++) {
            arrayChar[i] = characters.charAt(rand.nextInt(characters.length()));
        }



        if(sortingMode == 1){
            System.out.println("\nUnsorted STRING Array: " + Arrays.toString(arrayString));
            arrayString = bubbleStr(arrayString, arrayString.length);

            if (order == 1) {
                ArrayList<String> temp = new ArrayList<>();
                for (String i : arrayString) temp.add(i);
                Collections.reverse(temp);

                for (int i = 0; i < arrayString.length; i++) {
                    arrayString[i] = temp.get(i);
                }
            }
            System.out.println("\nSorted Array: " + Arrays.toString(arrayString));
        }
//        else{
//            System.out.println("\nUnsorted char Array: "+Arrays.toString(arrayChar));
//            arrayChar = quickSortString(arrayChar, arrayString.length);
//        }

        return arrayString;
    }

    private int[] bubbleInt(int numbers[], int n) {
        if (n == 1) {
            return numbers;
        }
        for (int i = 0; i < n - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                int temp = numbers[i];
                numbers[i] = numbers[i + 1];
                numbers[i + 1] = temp;
            }
        }
        return bubbleInt(numbers, n - 1);
    }

    private String[] bubbleStr(String letters[], int n) {
        if (n == 1) {
            return letters;
        }
        for (int i = 0; i < n - 1; i++) {
            if (letters[i + 1].compareToIgnoreCase(letters[i]) > 0) {
                String temp = letters[i];
                letters[i] = letters[i + 1];
                letters[i + 1] = temp;
            }
        }

        return bubbleStr(letters, n - 1);
    }

    private int[] quickSortInt(int numbers[], int left, int right) {
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

        if (left < j - 1) {
            return quickSortInt(numbers, left, j - 1);
        } else if (j + 1 < right) {
            return quickSortInt(numbers, j + 1, right);
        } else {
            return numbers;
        }
    }

//    private char[] quickSortString(char arrayChar[], int left, int right) {
//        //int numbers[] = Arrays.copyOf(Integer.parseInt(String.valueOf(arrayChar)), arrayChar.length);
//
//
//        int pivot = numbers[left];
//        int i = left;
//        int j = right;
//        int aux;
//        while (i < j) {
//            while (numbers[i] <= pivot && i < j) i++;
//
//            while (numbers[j] > pivot) j--;
//
//            if (i < j) {
//                aux = numbers[i];
//                numbers[i] = numbers[j];
//                numbers[j] = aux;
//            }
//        }
//        numbers[left] = numbers[j];
//        numbers[j] = pivot;
//
//        if (left < j - 1) {
//            return quickSortString(numbers, left, j - 1);
//        } else if (j + 1 < right) {
//            return quickSortString(numbers, j + 1, right);
//        } else {
//            return numbers;
//        }
//    }
}
