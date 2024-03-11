package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        sample1();
    }

    public static void sample1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet simbolu");
        String input = sc.nextLine();
        
        if (input.equals("programmēšana")) {
            System.out.println("Uzvarēji!");
        } else if (input.length() == "programmēšana".length()) {
            System.out.println("Vināds simbolu skaits");
        }
        else {
            System.out.println("Zaudēji!");
        }
    }
}