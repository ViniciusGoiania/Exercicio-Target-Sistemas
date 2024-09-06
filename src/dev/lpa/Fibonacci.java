package dev.lpa;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um numero: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isFibonacciSequence(number)) {
            System.out.println(number + " é uma numero da sequencia de Fibonacci.");
        } else {
            System.out.println(number + " não é um numero da sequencia de Fibonacci.");
        }
    }

    public static boolean isFibonacciSequence(int number) {
        int a = 0, b = 1, nextNumber = 0;

        if (number == 0 || number == 1) {
            return true;
        }

        while (nextNumber < number) {
            nextNumber = a + b;
            a = b;
            b = nextNumber;
        }

        return nextNumber == number;
    }
}
