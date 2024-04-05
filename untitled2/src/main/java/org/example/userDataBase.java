/////////////////***Andrey***//////////////////////////////
/////////////////***Created:24.03.2024**//////////////////
package org.example;

import java.util.Scanner;

public class userDataBase {

    public static void main(String[] args) {
        boolean logic = false;
        Person person1 = new Person();
        Person person2 = new Person();
        person1.name = "Ksenija";
        person1.surname = "Krascnevicha-Krasnecka";
        person1.age = 19;
        person1.dateOfBirth = "9/12/2004";
        person1.citizenship = "Latvian";
        person1.speak();
        person2.name = "Andrey";
        person2.surname = "Poddubnyak";
        person2.age = 24;
        person2.dateOfBirth = "03/08/1999";
        person2.citizenship = "Latvian";
        person2.speak();
        Scanner sc = new Scanner(System.in);
        System.out.println("Search for a person");
        while (!logic) {

            String input = sc.next();
            if (input.equals("Ksenija")) {
                System.out.println("Searched data: " + "  name: " + person1.name + "  surname: " + person1.surname + "  age: " + person1.age);
                System.out.println("End the search? (y/n) ");
                String response = sc.next();
                if (response.equals("y")) {
                    logic = false;
                } else {
                    System.out.println("Search a person");
                }
                else if 
            }
            if (input.equals("Andrey")) {
                System.out.println("Searched data: " + "  name: " + person2.name + "  surname: " + person2.surname + "  age: " + person2.age);
                System.out.println("End the search? (y/n) ");
                String response = sc.next();
                if (response.equals("y")) {
                    logic = false;
                } else {
                    System.out.println("Search a person");
                }
            }
        }
    }

    static class Person {
        String name, surname, citizenship, dateOfBirth;
        int age;
        void speak() {

        }
    }
}
