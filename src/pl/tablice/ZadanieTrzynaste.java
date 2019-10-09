package pl.tablice;

import java.util.Random;

public class ZadanieTrzynaste {

    private static int exclusiveNumber = 100;
    private static int numberOfElements = 10;

    public static void main(String[] args) {
        int[] newTable = new int[numberOfElements];
        Random random = new Random();
        for (int i = 0; i < numberOfElements; i++)
            newTable[i] = random.nextInt(exclusiveNumber);
        for (int element : newTable)
            System.out.println(element);
    }
}

//13.	Napisz program, który utworzy 10 elementową tablicę
// i wypełni ją losowymi liczbami. Następnie program wyświetli liczby na konsoli w pętli.