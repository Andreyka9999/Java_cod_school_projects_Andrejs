package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
      //  System.out.println("Ievadi skaitli!");
      //  int input = sc.nextInt();

      //  if (input > 10 || input < 5) {
      //      System.out.println("$$");
     //   } else if (input >= 6 && input <= 9) {
        //    System.out.println("$");

      //  }
        sample1();
    }
//===========================================================================
    public static void sample1 () {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet simbolu");
        String input = sc.nextLine();

        if (input.equals("programmēšana")) {
            System.out.println("Uzvarēji!");
        } else if (input.length() == "programmēšana".length()) {
            System.out.println("Vināds simbolu skaits");
        } else {
            System.out.println("Zaudēji!");
        }
       sample2();
    }
    //===========================================================================
    public static void sample2 () {
    for (int i = 0; i <11; i++) {
        System.out.println(i);
    }
    }
}
