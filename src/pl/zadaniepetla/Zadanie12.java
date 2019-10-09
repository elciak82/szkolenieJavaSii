package pl.zadaniepetla;

import java.util.Scanner;

public class Zadanie12 {

    private static int first = 0;
    private static int last = 100;

    public static void main(String[] args) {
        drawingNumber();
    }

    private static void drawingNumber() {
        do {
            System.out.println("Proszę podać liczbę z przedziału od " + first + " do " + last + ".");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            if (first <= number && number <= last) {
                System.out.println("Podana liczna to: " + number + ". Dziękuję!");
                break;
            } else System.out.println("Podana liczba nie miesci sie w przedziale.");
        } while (true);
    }
}

//12.	Napisz program, który zmusi użytkownika do podania liczby,
// która została przez niego wylosowana z przedziału 0-100
