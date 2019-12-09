package pl.mapy;

import pl.kolekcje.Person;

import java.util.HashMap;

public class MapyMain {
    public static void main(String[] args) {
        HashMap<String, Person> mapa = new HashMap<>();
        mapa.put("34567890033333", new Person("Ewe", "Wal"));
        Person person = mapa.get("34567890033333");
        System.out.println();
    }
}
