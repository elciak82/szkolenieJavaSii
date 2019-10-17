package pl.tablice;

import java.util.Arrays;
import java.util.Random;

public class Zadanie16_17 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] array = new int[5];
        int uniqueValues = 0;

        while (uniqueValues < array.length) {
            int element = random.nextInt(30);
            if (!arrayContains(array, element)) {
                array[uniqueValues] = element;
                uniqueValues++;
            }
        }
        System.out.println("Wylosowane liczby to: ");
        for (int element : array) {
            System.out.println(element);
        }
        countVariance(array);
    }

    private static boolean arrayContains(int[] array, int number) {
        boolean result = false;

        for (int element : array) {
            if (element == number) {
                result = true;
                break;
            }
        }
        return result;
    }

    private static double countAverage(int[] array) {
        double sum = Arrays.stream(array).sum();
        System.out.println("Suma elementów tablicy: " + sum);
        double avr;
        avr = sum / array.length;
        System.out.println("Srednia elementów tablicy: " + avr);
        return avr;
    }

    private static double countVariance(int[] array) {
        int avr = (int) countAverage(array);
        double[] newArray = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            double counter = Math.pow((array[i] - avr), 2);
            newArray[i] = counter;
        }
        double countersSum = Arrays.stream(newArray).sum();
        System.out.println("Licznik: " + countersSum);
        double variance = countersSum / newArray.length;
        System.out.println("Wariancja: " + variance);
        return variance;
    }
}


//16.	Napisz program, który wygeneruje tablicę liczb o długości
// 20 z losowymi liczbami. Tablica powinna zawierać liczby z zakresu 0-30
// ale żadna z wylosowanych liczb nie powinna się powtórzyć.

//17. Tablica z poprzedniego zadania posłuży nam teraz jako baza do wyliczenia wariancji.
// Wzór na wariancję to  gdzie i jest kolejnym pomiarem, s średnią arytmetyczną ze wszystkich liczb, N ilością liczb w tablicy.
