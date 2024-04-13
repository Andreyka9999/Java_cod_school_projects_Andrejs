package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        sample1();
    }
    public static void sample1() {
        Scanner sc = new Scanner(System.in);

        // Lietotājs ievada masīva garumu
        System.out.println("Ievadiet masīva garumu: ");
        int length = sc.nextInt();
        if (length < 2) {
            System.out.println("Masīva garums nevar būt mazāk par 2!");
            return;
        }
        int[] m = new int[length];

        // Aizpildam masīvu ar lietotāja ievadītajiem skaitļiem
        System.out.println("Ievadiet " + length + " skaitļus: ");
        for (int i = 0; i < length; i++) {
            m[i] = sc.nextInt();
        }
        int maxNum = m[0];
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += m[i];
            // Parbaudam maksimālo masīvu skaitļu
            if (m[i] > maxNum) {
                maxNum = m[i];
            }

        }
        System.out.println("Masīva elementu summa ir: " + sum);
        System.out.println("Masīva maksimalais skaitlis ir: " + maxNum);
    }
}