package pl.zadania;

import java.util.Random;

public class Zadanie1110 {
    public static void main(String[] args) {
        int liczbaPierwsza = 6; // pkt 1
        System.out.println(liczbaPierwsza); // pkt 2

        int modulo = liczbaPierwsza % 2;
        System.out.println(modulo); // pkt 3

        System.out.println(isEven(liczbaPierwsza)); // pkt 4

        Random random = new Random();
        int drawnNumber = random.nextInt(100);
        System.out.println("Wylosowana liczba to: " + drawnNumber);

        System.out.println("Liczby mniejsze od wylosowanej liczby: ");
        for (int i = 0; i < drawnNumber; i++) { // pkt 5, 6, 7
            if (isEven(i)) {
                System.out.println(i + " to liczba jest parzysta.");
            } else System.out.println(i + " to liczba jest nieparzysta.");
        }
        int dividers = 0; // pkt 8
        for (int i = 1; i <= drawnNumber; i++) {
            if (drawnNumber % i == 0) {
                dividers++;
                System.out.println("Dzielnik liczby " + drawnNumber + ": " + i);
            }
        }
        if (dividers == 2) { // pkt 8
            boolean isPrimary = true;
            System.out.println("Wylosowana liczba jest liczbą pierwszą.");
        } else System.out.println("Wylosowana liczba NIE jest liczbą pierwszą.");

        int[] firstArray = {1, 3, 5, 90, 23, 56}; // pkt 9
        System.out.println("Pierwsza tablica: ");
        for (int element : firstArray) { // pkt 10
            System.out.println(element);
        }
        int[] secondArray = new int[6]; // pkt 11
        for (int j = firstArray.length; j > 0; j--) {
            secondArray[firstArray.length - j] = firstArray[j - 1];
        }
        System.out.println("Druga tablica: "); // pkt 12
        for (int element : secondArray)
            System.out.println(element);

        System.out.println("Słowo w tablicy: ");
        String word = "primitivo";
        char[] stringToArray = word.toCharArray(); // pkt 13

        for (char element : stringToArray) {
            System.out.println(element);
        }
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

}

// Słowem wstępu: liczba pierwsza, to taka liczba, która posiada tylko dwa dzielniki (dzieli się bez reszty),
// którymi są 1 i ona sama. Na przykład 2 jest pierwszą z kolei liczbą pierwszą, bo dzieli się przez 1 i 2.
// następną liczbą pierwszą jest 3, potem 5 itd…
//
// 1.Utwórz zmienną o nazwie liczbaPierwsza, która będzie przechowywała liczby cakowite
// i przypisz do niej jakąś liczbę, na przykład 6.
// 2.Wypisz tę liczbę na konsoli. Tak po prostu, bez niczego więcej.
// Operator arytmetyczny % oznacza resztę z dzielenia (modulo) tzn, jeli podzielimy 6%2,
// to wynikiem takiej operacji jest 0, bo nie pozostaje reszta z takiego dzielenia. Jeśli zrobimy 5%2,
// to wynikiem będzie 1, ponieważ 5 dzieli się na 2 (2 mieści się w 5 dwa razy) i zostaje 1 reszty.
// 3.Wykonaj operację modulo na naszej zmiennej "liczbaPierwsza" i wypisz wynik na konsolę.
// 4.Sprawdź czy wpisana liczba do zmiennej "liczbaPierwsza" jest parzysta
// 5.Wylosuj liczbę za pomocą klasy Random metodą nextInt(100), która wylosuje liczbę
// od 0 do 99 i sprawdź, czy wylosowana liczba jest liczbą parzystą.
// 6.Wylosuj liczbę za pomocą generatora liczb losowych Random i wypisz na konsolę wzsystkie liczby od 0 do wylosowanej liczby
// 7.Zmodyfikuj poprzednie zadanie i obok wypisanej liczby dopisz, czy jest parzysta, czy nie.
// 8.wylosuj liczbę i sprawdź czy wszystkie liczby mniejsze od niej są jej dzielnikami, jeżeli wylosowana liczba
// jest liczbą pierwszą ustaw zmienną isPrimary, która przechowuje wartości typu boolean na true.
// 9.Utwórz zmienną tablicową typu int i zainicjuj ją wartościami 1,3,5,90,23,56
// 10.Zaalokowaną tablicę z zadania poprzedniego wypisz na konsolę w pętli.
// 11.Wypisz tablicę z poprzedniego zadnia od tyłu.
// 12.Odwróć tablicę zaalokowaną w poprzenim zadaniu, tak, żeby zawierała wartości 56,23,90,5,3,1
// 13.Utwórz zmienną typu String i przypisz do niej dowolne słowo. Następnie podziel ten ciąg na tablicę charów.
// Na przykład mamy słowo "onomatopeja" i na wyjściu mamy tablicę 'o','n','o','m','a','t','o','p','e','j','a'.
