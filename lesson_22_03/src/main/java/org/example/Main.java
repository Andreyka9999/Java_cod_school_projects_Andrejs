package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet pozitīvu skaitli: ");
        int number = sc.nextInt();

        int factorial = 1;
        for (int i = 1; i<= number; i++) {
            factorial *= i;
        }
        System.out.println("Faktoriāl no: " + number + " ir: " + factorial);
    }
}