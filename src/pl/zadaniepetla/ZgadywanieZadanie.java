package pl.zadaniepetla;

import java.util.Scanner;

public class ZgadywanieZadanie {
    public static void main(String[] args) {
//        System.out.println(); //out - strumien wyjścia - konsola
        Scanner scanner = new Scanner(System.in);//in - musimy powidzieć javie w jaki sposób chcemy pobrac dane. Alt + Enter - zmienn lokalna
        //nowy obiekt typu Scanner
        int i = scanner.nextInt(); //scanner - na consoli pojawi sie liczba, czekaj na nią - program bedzie czekał az pojawi sie liczba
        System.out.println(i);
    }
}
// Zadanie: program wybiera l liczbę całkowita z zakresu: 1-2256000. Porgram pyta usera jaką wybrał liczbę, user musi odgadnąć. Jeli nie odgadnie
// porgram o tym poinformuje i zada to samo pytanie (jaką wybrał liczbę) aż do skutku. Bez internetów! :D
