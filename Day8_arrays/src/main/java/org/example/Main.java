package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean out = sample2(5);
        System.out.println(out);


    }

    public static boolean sample2(int times) {
        Scanner sc = new Scanner(System.in);
        int input = 0;

        for (int i = 0; i < times; i++) {
            System.out.println("Ievadiet skaitli!");
            input = sc.nextInt();
            if (input == 28) {
                return true;
            }
        }
        return false;
    }
    }
