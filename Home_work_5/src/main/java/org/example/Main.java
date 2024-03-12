package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet skaitli!");
        int input = sc.nextInt();

            if (input >= 1 && input <= 10) {
                System.out.println("Hello world!");
            } else if (input <1) {
                System.out.println("Ievadiet pareizo skaitli!");
            } else {
                System.out.println("Lietotājs nav atrasts.");
            }
    }
}