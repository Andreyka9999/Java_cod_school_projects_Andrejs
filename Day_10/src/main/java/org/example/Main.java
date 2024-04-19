package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
    }
    public static void task1(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Ievadiet studentu skaitu: ");
        int studentInput = sc.nextInt();

        List<String> studentNames = new ArrayList<>();

        for (int i = 0; i < studentInput; i++) {
            System.out.println("Ievadiet " + (i+1) + ". studenta vārdu: ");
            String name = sc.next();
            studentNames.add(name);

        }
        System.out.println(studentNames);
    }
}