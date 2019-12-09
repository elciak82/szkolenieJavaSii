package pl.kolekcje;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.ArrayList;
import java.util.Scanner;

public class kolekcjeMain {

//    obiekty sa wieksze niz prymitywy
    // Person osoba -> osoba przechowuje obiekt klasy Person
//    int[] a = nwe int[10] - 10 elementowa tablica intów - jest rezerwowane miejsce
    //w kolekcji nie da sie przechowywac primitivów (iny, ale Integer już tak)

    public static void main(String[] args) {
        //jakie właściwości posiada private
        //tworzymy BAZE DANYCH UZYTKOWNIKOW KURSU
        System.out.println(("Prosze podać imię uczestnika."));
        Scanner scanner = new Scanner(System.in);
        String imie = scanner.next();

        System.out.println(("Prosze podać nazwisko uczestnika."));
        String nazwisko = scanner.next();

        ArrayList<Person> people = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Person person = new Person(imie, nazwisko);
            people.add(person);
        }
        System.out.println(people.size());
    }
}
