package pl.zadaniepetla;

public class ZadanieJedenaste {
    public static void main(String[] args) {
        System.out.println(sumOfNumbers(99));
    }

    private static int sumOfNumbers(int number) {
        int sum = 0;
        for (int i = 0; i < number; i++) {
            sum = sum + i;
        }
        return sum;
    }
}

//11.	Napisz program, który oblicza sumę wszystkich liczb poprzedzających zadaną
// przez użytkownika liczbę np. dla liczby 100 wynikiem powinno być 5050 (0+1+2+3+4...)
