package dev.lpa;

import java.util.Scanner;

public class Lamps {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean lamp1 = false, lamp2 = false, lamp3 = false;

        System.out.println("Liguei o interruptor A. Qual lâmpada acendeu? (1, 2 ou 3): ");
        int switchA = scanner.nextInt();

        if (switchA == 1) {
            lamp1 = true;
        } else if (switchA == 2) {
            lamp2 = true;
        } else if (switchA == 3) {
            lamp3 = true;
        }

        System.out.println("Agora desliguei o interruptor A e liguei o B");
        System.out.println("Qual lâmpada acendeu agora? (1, 2 ou 3): ");
        int switchB = scanner.nextInt();

        if (switchB == 1 && !lamp1) {
            lamp1 = true;
        } else if (switchB == 2 && !lamp2) {
            lamp2 = true;
        } else if (switchB == 3 && !lamp3) {
            lamp3 = true;
        }

        if(!lamp1) {
            System.out.println("A lâmpada 1 é acesa pelo interruptor C.");
        }

        if(!lamp2) {
            System.out.println("A lâmpada 2 é acesa pelo interruptor C.");
        }

        if(!lamp3) {
            System.out.println("A lâmpada 3 é acesa pelo interruptor C.");
        }

        if(switchA == 1) {
            System.out.println("A lâmpada 1 é acesa pelo interruptor A.");
        } else if (switchA == 2) {
            System.out.println("A lâmpada 2 é acesa pelo interruptor A.");
        } else if (switchA == 3) {
            System.out.println("A lâmpada 3 é acesa pelo interruptor A.");
        }

        if (switchB == 1 && !lamp1) {
            System.out.println("A lâmpada 1 é acesa pelo interruptor B.");
        } else if (switchB == 2 && !lamp2) {
            System.out.println("A lâmpada 2 é acesa pelo interruptor B.");
        } else if (switchB == 3 && !lamp3) {
            System.out.println("A lâmpada 3 é acesa pelo interruptor B.");
        }

        scanner.close();
    }
}
