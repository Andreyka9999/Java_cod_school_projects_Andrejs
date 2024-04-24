package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Tools {

    public List<Integer> tools(boolean userInput) {
        List<Integer> list = new ArrayList<>();
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        if (userInput) {
            System.out.println("Lūdzu ievadiet 10 skaitļus: ");
            for (int i = 0; i < 10; i++) {
                list.add(sc.nextInt());

            }
        } else{
                for (int i = 0; i < 10; i++) {
                    list.add(rand.nextInt(100));
                }
            }
            return list;
        }
}
