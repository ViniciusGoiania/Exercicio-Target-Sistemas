package dev.lpa;

import java.util.Scanner;

public class CheckStringA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe uma string ou palavra: ");
        String value = scanner.nextLine();
        scanner.close();

        int count = countLetter(value);

        if (count > 0) {
            System.out.println("A letra 'a' ou 'A' aparece " + count + " vez(es) na string ou palavra fornecida.");
        } else {
            System.out.println("A letra 'a' ou 'A' não aparece na string ou palavra fornecida.");
        }
    }

    public static int countLetter(String value) {
        int count = 0;

        for (int i = 0; i< value.length(); i++) {
            char c = value.charAt(i);
            if (c == 'a' || c == 'A') {
                count++;
            }
        }

        return count;
    }
}
