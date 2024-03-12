package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int summa = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Ievadiet 5 skaitļus.");
            int number = sc.nextInt();
            summa = summa + number;
        }
        System.out.println("Skaitļu summa ir: " + summa);

    }
}