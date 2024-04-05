package org.example;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int sum = 0;
        boolean finished = false;



        while (!finished) {
            System.out.print("Ievadiet skaitli: ");
            int number = sc.nextInt();
            sum += number; // sum = sum + number;

            System.out.print("Beigt darbu? (ja/ne): ");
            String response = sc.next();

            if (response.equals("ja")) {
                finished = true;
            }
        }

        System.out.println("Summa ir: " + sum);
    }
}