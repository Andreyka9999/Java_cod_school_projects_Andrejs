package org.example;

import java.util.Random;
import java.util.Scanner;

public class Games {

    public boolean game(int num1, int num2, int num3) {

        Random rand = new Random();

        int rand1 = rand.nextInt(16);
        int rand2 = rand.nextInt(16);
        int rand3 = rand.nextInt(16);

        if (num1 == rand1 || num2 == rand2 || num3 == rand3) {
            return true;
        } else {
            return false;
        }

    }
}