package org.example;

public class Main {
    public static void main(String[] args) {
        int result = 0;
        for (int i = 1; i < 6; i++) {
            result = result + i;
        }

        for (int j = 1; j <= result; j++) {
            System.out.println(j);
        }
    }
}