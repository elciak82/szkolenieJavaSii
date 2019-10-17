package pl.zadania;

import java.util.Random;

public class Zadanie18_19 {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(50) + 1;
        System.out.println("Random number: " + randomInt);

        System.out.println("FOR loop: ");
        for (int i = 0; i <= randomInt; i++) {
            System.out.println(i);
        }
        System.out.println("WHILE loop:");
        int j = 0;
        while (j <= randomInt) {
            System.out.println(j);
            j++;
        }
    }
}

//18.	Utwórz metodę pobierającą dodatnią liczbę całkowitą X, która wyświetli na ekranie liczby od zera do X,
//19.	Jeśli w zadaniu 1. użyłeś pętli for przerób tą metodę na while (lub odwrotnie),

