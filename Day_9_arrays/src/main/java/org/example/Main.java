package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        homework1();
    }
public static void homework1() {
        int[] numbers = new int[10];
    int max = Integer.MAX_VALUE;
        Random r = new Random();


        for (int i = 0; i<numbers.length; i++) {
            numbers[i] = r.nextInt((99-1+1)+1);
            if (max < numbers[i]){
                max = numbers[i];
            }
            System.out.println(numbers[i] + " ");
        }

    System.out.println("Lielākais skaitlis ir " + max);
}



}
