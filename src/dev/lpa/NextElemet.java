package dev.lpa;

public class NextElemet {

    public static void main(String[] args) {
        System.out.println("a) Próximo número: " + letterA(7));
        System.out.println("b) Próximo número: " + letterB(64));
        System.out.println("c) Próximo número: " + letterC(36));
        System.out.println("d) Próximo número: " + letterD(64));
        System.out.println("e) Próximo número: " + letterE(5, 8));
        System.out.println("f) Próximo número: " + letterF(19));
    }

    public static int letterA(int current) {
        return current + 2;
    }

    public static int letterB(int current) {
        return current * 2;
    }

    public static int letterC(int current) {
        int squareRoot = (int) Math.sqrt(current);
        return (squareRoot + 1) * (squareRoot + 1);
    }

    public static int letterD(int current) {
        int squareRoot = (int) Math.sqrt(current);
        int nextEvenNumber = squareRoot + 2;
        return nextEvenNumber * nextEvenNumber;
    }

    public static int letterE(int secondToLast, int last) {
        return secondToLast + last;
    }

    public static int letterF(int current) {
        return current + 1;
    }
}
