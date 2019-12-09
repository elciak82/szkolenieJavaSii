package pl.kolekcje;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class KolekcjeMain {

//    obiekty sa wieksze niz prymitywy
    // Person osoba -> osoba przechowuje obiekt klasy Person
//    int[] a = nwe int[10] - 10 elementowa tablica intów - jest rezerwowane miejsce
    //w kolekcji nie da sie przechowywac primitivów (iny, ale Integer już tak)

    public static void main(String[] args) {
        //jakie właściwości posiada private
        //tworzymy BAZE DANYCH UZYTKOWNIKOW KURSU
        Scanner scanner = new Scanner(System.in);
        ArrayList<Person> people = new ArrayList<>();
        String decyzja;

        //Adrian
        while (true) {
            System.out.println("Wybierz co chcesz zrobić.");
            System.out.println("1. Dodaj użytkownika.");
            System.out.println("2. Pokaż wszystkich użytkowników.");
            System.out.println("3. Zamknij okno.");
            String menu = scanner.next();

            switch (menu) { //ALE CZAD!!
                case "1":
                    addStudent(scanner, people);
                    break;
                case "2":
                    showAll(people);
                    break;
                case "3":
                    System.exit(0);
                    break;
                default:
            }
        }

    }

    private static void addStudent(Scanner scanner, ArrayList<Person> people) {
        System.out.println(("Prosze podać imię uczestnika."));
        String imie = scanner.next();

        System.out.println(("Prosze podać nazwisko uczestnika."));
        String nazwisko = scanner.next();

        Person person = new Person(imie, nazwisko);
        people.add(person);
    }

    private static void showAll(ArrayList<Person> people) {
        for (Person p : people) {
            System.out.println(p.getImie() + " " + p.getNazwisko());
        }
    }

        private static void showAllIterator(ArrayList<Person> people) {
            Iterator<Person> iterator = people.iterator();
            while(iterator.hasNext()) {
                Person p = iterator.next();
                System.out.println(p.getImie() + " " + p.getNazwisko());
            }
                    //iterator obiekt który rzchodzi po kol w 1 i w 2 stronę
                    //istotne jest ze dzzieje się to w trakcie dzialania iteracji
        //foreach jest tylko do odczytu, ale jak cos usuniemy w trakcie iteracji to foreah sie wywali

//            }
    }
    //zadanie zamiast kolekcji to mapa, klucz to pesel
    //dodatkowa opcja to wyszukaj po peselu
}
