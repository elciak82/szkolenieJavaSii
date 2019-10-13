package pl.tablice;

import java.util.Random;

public class Zadanie_16 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] array = new int[20];
        int uniqueValues = 0;

        while(uniqueValues < array.length) {
            int element = random.nextInt(30);
            if (!contains(array, element)) {
                array[uniqueValues] = element;
                uniqueValues++;
            }
        }
        for (int element : array) {
            System.out.println(element);
        }
    }

    private static boolean contains(int[] array, int number) {
        boolean result = false;

        for (int element : array) {
            if (element == number) {
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
