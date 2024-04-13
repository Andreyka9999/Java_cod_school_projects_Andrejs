package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double result = sample1();
        System.out.println(result);


    }

    public static double sample1() {
        Scanner sc = new Scanner(System.in);
        double[] m = new double[10];

        for (int i = 0; i < m.length; i++) {
            System.out.println("Ievadiet skaitli!");
            m[i] = sc.nextDouble();

        }
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum = sum + m[i];

        }
        System.out.println(sum / m.length);
        return sum;
    }

}