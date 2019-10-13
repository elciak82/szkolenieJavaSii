package pl.tablice;

import java.util.Random;

public class Zadanie_16 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            int i1 = random.nextInt(30);
            if (contains(array, i1)) {
            } else {
                array[i] = i1;
//                System.out.println(i1);
            }
        }
        for (int element : array) {
            System.out.println(element);
        }
    }

    private static boolean contains(final int[] array, final int v) {
        boolean result = false;

        for (int i : array) {
            if (i == v) {
                result = true;
                break;
            }
        }
        return result;
    }
}


//16.	Napisz program, który wygeneruje tablicę liczb o długości
// 20 z losowymi liczbami. Tablica powinna zawierać liczby z zakresu 0-30
// ale żadna z wylosowanych liczb nie powinna się powtórzyć.
