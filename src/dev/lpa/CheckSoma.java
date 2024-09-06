package dev.lpa;

public class CheckSoma {

    public static void main(String[] args) {
        int INDICE = 12, SOMA = 0, K = 1;

        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }

        // o valor final é 78
        System.out.println("O valor final da SOMA é: " + SOMA);
    }
}
