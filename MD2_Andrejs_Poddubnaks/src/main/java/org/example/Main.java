package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet tekstu!");
        String input = sc.nextLine();

        if (input.length() > 5 ) {
            System.out.println("Programmēt ir forši!");
        }
    }
}