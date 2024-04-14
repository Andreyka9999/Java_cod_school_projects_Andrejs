package org.example;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        sample1();
    }
    public static void sample1() {
        int[] m = new int [10];

        Random rand = new Random();

        for (int i = 0; i < m.length; i++) {
            m[i] = rand.nextInt(1000);
        }
        System.out.println("Numbers are generated: \n"+ Arrays.toString(m));
    }
}