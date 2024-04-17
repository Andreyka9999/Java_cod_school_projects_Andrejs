package org.example;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 4, 7, 2, 9, 4, 6};
        int search = 10;
        search(numbers, search);
    }

    public static void search(int[] array, int number) {
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                System.out.println("Skaitlis " + number + " atrodas indeksā " + i);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Skaitlis " + number + " nav atrasts.");
        }
    }
}

