package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean a = sample1("aaafdf");
        System.out.println(a);
    }
    public static boolean sample1(String b) {


    if (b.toLowerCase().contains("aaa")) {
        return true;
    } else {
        return false;
    }
    }
}