package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task2();
        task3();
       // Scanner sc = new Scanner(System.in);
       // System.out.println("Ievadiet pozitīvu skaitli: ");
      //  int number = sc.nextInt();

      //  int factorial = 1;
      //  for (int i = 1; i <= number; i++) {
       //     factorial *= i;
       // }
      //  System.out.println("Faktoriāl no: " + number + " ir: " + factorial);

    }

    public static void task2(){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Ievadiet skaitli: ");
        int numberSqrt = sc1.nextInt();

        int result = 1;
        for (int i = 1; i <= numberSqrt; i++) {
            result = numberSqrt * i;
            System.out.println("Rezultāts: " + result);
        }
        System.out.println("Ievadiet bazi!");
        int baze = sc1.nextInt();
        System.out.println("Ievadiet kapinataju!");
        int kapintajs  = sc1.nextInt();

        int result1 = 1;
        for (int i = 0; i < kapintajs; i++) {
            result1 = result1 * baze;
        }
        System.out.println(result1);
    }
    //-----------------task3--------------------------------/////
    public static void task3 () {
         
}
