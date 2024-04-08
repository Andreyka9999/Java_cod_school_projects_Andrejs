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

    if (input.contains("aaa")) {
        System.out.println("The text contains this simbols");
        return 1;
    } else {
        System.out.println("Text doesn`t contains neccessary simbols");
        return 0;
    }
    }
}