package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Double> numbers = task1();
        double average = calculateAverage(numbers);
        System.out.println("Vidējā vērtība: " + average);
    }

    public static List<Double> task1(){
        Scanner sc = new Scanner(System.in);
        List<Double> numbers = new ArrayList<>();

        System.out.println("Ievadiet 6 skaitļus: ");

        for(int i = 0; i < 6; i++){
            System.out.println("Ievadiet skaitli!");
            Double in = sc.nextDouble();
            numbers.add(in);
        }
        return numbers;
    }

    public static double calculateAverage(List<Double> numbers){
        double sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            double number = numbers.get(i);
            sum += number;
        }
        return sum / numbers.size();
    }
}