package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ievadiet 3 skaitļus: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        Games game = new Games();
        boolean result = game.game(num1, num2, num3);
        System.out.println("Resultāts: " + result);

    }

}