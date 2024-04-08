package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int result = sample1();
        System.out.println(result);
    }
    public static int sample1() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Type a text!");
    String input = sc.nextLine();

    if (input.toLowerCase().contains("aaa")) {
        return 1;
    } else {
        return 0;
    }
    }
}