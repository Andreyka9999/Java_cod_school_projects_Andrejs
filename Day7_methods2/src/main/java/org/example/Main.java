package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int result = sample2();

       System.out.println(result);
    }

    public static int sample2() {
        Scanner sc = new Scanner (System.in);
        int result = 0;

        while (result < 1) {
            System.out.println("Ievadiet skaitli!");
            result = sc.nextInt();
        }
        return result;
    }

}