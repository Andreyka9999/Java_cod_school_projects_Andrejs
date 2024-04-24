package org.example;

import java.util.Random;

public class Games {

    public boolean game(int num1, int num2, int num3) {

        Random rand = new Random();


        int rand1 = rand.nextInt(16);

        if (num1 == rand1 || num2 == rand1 || num3 == rand1) {
            return true;
        } else {
            return false;
        }

    }
}