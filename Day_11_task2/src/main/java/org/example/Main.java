package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Tools tools = new Tools();

        List<Integer> userList = tools.tools(true);
        System.out.println("Lietotāja ievadītie skaitļi: ");
        printList(userList);

        List<Integer> randList = tools.tools(false);
        System.out.println("Ģenerētie skaitļi:");
        printList(randList);

    }
    public static void printList(List<Integer> list) {
        for (int i = 0; i < 10; i++) {
            System.out.println(list + " ");
        }
    }
}