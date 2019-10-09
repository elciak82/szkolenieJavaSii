package pl.tablice;

import java.util.Random;

public class ZadanieTrzynasteCzternaste {

    public static void main(String[] args) {
        int[] firstTable = new int[5];
        Random random = new Random();
        for (int i = 0; i < 5; i++)
            firstTable[i] = random.nextInt(100);

        System.out.println("Tabela z zadania nr 13: ");
        for (int element : firstTable)
            System.out.println(element);

        System.out.println("Tabela z zadania nr 14: ");
        int[] secondTable = new int[firstTable.length];
        for (int i = firstTable.length; i > 0; i--) {
            secondTable[firstTable.length-i] = firstTable[i-1];
//            for (int j = 0; j < firstTable.length; j++) {
//                secondTable[j] = firstTable[i];
//                i--;
//            }
        }
        for (int element : secondTable)
            System.out.println(element);
    }
}

//13.	Napisz program, który utworzy 10 elementową tablicę
// i wypełni ją losowymi liczbami. Następnie program wyświetli liczby na konsoli w pętli.

//14.	Tablicę z poprzedniego zadania program powinien odwrócić.
// To znaczy, ta liczba, która posiadała indeks 0 teraz będzie ostatnia itd.