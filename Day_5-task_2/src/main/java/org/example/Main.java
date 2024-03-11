package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadi skaitli!");
        int input = sc.nextInt();

        if (input > 10 || input < 5) {
            System.out.println("$$");
        } else if (input >= 6 && input <= 9) {
            System.out.println("$");
        }
    }
}