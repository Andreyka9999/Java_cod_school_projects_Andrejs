package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        randomNumber();

    }
    public static void randomNumber(){
        int[] numbers = new int[10];

        Random randNum = new Random();

        List<Integer> numberLst = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            int randomNumber = randNum.nextInt(10);
            numberLst.add(randomNumber);
            System.out.print(numberLst.get(i) + " ");
        }
        int max1 = Collections.max(numberLst);
        numberLst.remove(Integer.valueOf(max1));
        int max2 = Collections.max(numberLst);
        int sum = max1 + max2;
        System.out.println("\nMax number is: " + sum);



    }
}