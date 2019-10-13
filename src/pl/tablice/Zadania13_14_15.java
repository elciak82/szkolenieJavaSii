package pl.tablice;

import java.util.Random;

public class Zadania13_14_15 {

    public static void main(String[] args) {
        int[] firstArray = new int[5];
        Random random = new Random();
        for (int i = 0; i < 5; i++)
            firstArray[i] = random.nextInt(100);

        System.out.println("Tablica z zadania nr 13: ");
        for (int element : firstArray)
            System.out.println(element);

        System.out.println("Tablica z zadania nr 14: ");
        int[] secondArray = new int[firstArray.length];
        for (int i = firstArray.length; i > 0; i--) {
            secondArray[firstArray.length-i] = firstArray[i-1];
//            for (int j = 0; j < firstArray.length; j++) {
//                secondTable[j] = firstArray[i];
//                i--;
//            }
        }
        for (int element : secondArray)
            System.out.println(element);

        int sum = 0;
        for (int i = 0; i < secondArray.length-1; i++) {
            sum = secondArray[i] + sum;
        }
        System.out.println("Srednia arytmetyczna wynosi: " + sum / secondArray.length);
    }
}

//13.	Napisz program, który utworzy 10 elementową tablicę
// i wypełni ją losowymi liczbami. Następnie program wyświetli liczby na konsoli w pętli.

//14.	Tablicę z poprzedniego zadania program powinien odwrócić.
// To znaczy, ta liczba, która posiadała indeks 0 teraz będzie ostatnia itd.

//15.	Tablica z poprzedniego zadania posłuży do policzenia średniej arytmetycznej
// ze wszystkich liczb w niej zawartych.