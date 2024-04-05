package org.example;

public class Main {
    public static void main(String[] args) {
        int codeLength = 45; // Длина случайной последовательности
        StringBuilder randomCode = new StringBuilder();
        boolean isTrue = true;

        while (isTrue) {
            for (int i = 0; i < codeLength; i++) {
                char randomChar = (char) ('!' + Math.random() * ('~' - '!' + 1)); // Диапазон символов от '!' до '~'
                randomCode.append(randomChar);
            }

            System.out.println("Случайный код: " + randomCode);
        }
    }

    public static class Thee {
        public static void sample2() {

        }
    }
}