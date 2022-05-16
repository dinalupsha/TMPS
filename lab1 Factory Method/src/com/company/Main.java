package com.company;

// C L I E N T

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите количество создаваемых объектов:");
        int deliversCounter = 0;
        Scanner scanner = new Scanner(System.in);
        deliversCounter = scanner.nextInt();

        Create create = new Create();
        Delivers[] delivers = create.createDelivers(deliversCounter);


    }
}
