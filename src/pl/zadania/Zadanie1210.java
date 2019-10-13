package pl.zadania;

import java.util.Scanner;

public class Zadanie1210 {
    public static void main(String[] args) {
        hello();
        fetchInt();
    }

    private static void hello() {
        System.out.println("hello world");
    }

    private static void fetchInt() {
        System.out.println("Proszę o podanie liczby z zakresu 0 - 6.");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        if (isEven(value)) {
            System.out.println("Wybrałeś parzystą liczbę.");
        } else System.out.println("Twoja liczba jest nieparzysta.");
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }


}

//        1. Napisz program, który w metodzie main wywoła metodę hello, która zwraca nic i nie przyjmuje żadnych parametrów,
//        a jej zadaniem jest wypisać na konsolę "hello world"
//        2. W tym samym programie napisz metodę zwracającą void i nie przyjmującą żadnych parametrów o nazwie fetchInt.
//        W jej ciele poproś użytkownika o podanie liczby z zakresu 0 - 6. Przypisz pobraną liczbę do zmiennej int value.
//        Następnie wywołaj tę metodę z maina.
//        3. W tym samym programie napisz metodę isEven, która będzie zwracała boolean i będzie przyjmowała w parametrze
//        liczbę całkowitą. Jej zadaniem będzie sprawdzenie czy liczba podana w parametrze jest parzysta. Jeśli tak,
//        to metoda powinna zwrócić true, w przeciwnym wypadku false.
//        4. Zmodyfikuj metodę fetchInt napisaną wcześniej. Pod deklaracją zmiennej value napisz ifa,
//        który w zwoim parametrze przyjmie metodę isEven z value jako parametr. Jeśli warunek będzie prawdziwy
//        program ma wypisać na konsolę "wybrałeś parzystą liczbę" w przecownym razie ma na napisać "Twoja liczba jest nieparzysta"
