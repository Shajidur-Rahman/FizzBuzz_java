package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //first part
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int number = scanner.nextInt();

        //second part
        if (number % 3 == 0 && number % 5 == 0)
            System.out.println("FizzBuzz");
        else if (number % 5 == 0)
            System.out.println("Fizz");
        else if (number % 3 == 0)
            System.out.println("Buzz");

        else
            System.out.println(number);

    }
}

