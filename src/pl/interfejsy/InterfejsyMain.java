package pl.interfejsy;


import java.util.ArrayList;
import java.util.Collection;

public class InterfejsyMain {
    public static void main(String[] args) {
        Prostokat prostokat = new Prostokat( 2, 3); // prostokąr jest typu Porstokąt, Obwodoliczalna, Poleiczalna
        wyswietlPolePowierzchni(prostokat);
        wyswietlObwód(prostokat);

        Trojkat trojkat = new Trojkat();
        wyswietlPolePowierzchni(trojkat);
        wyswietlObwód(trojkat);

        Kolo kolo = new Kolo();
        wyswietlPolePowierzchni(kolo);
        wyswietlObwód(kolo);

//        Przechowywalna[] kontener = new Przechowywalna[0]; //utw tablicy o długości 0 - nic tam nie ma, obiektór które sa typu przechowywaln
//        kontener = new Przechowywalna[1]; nieoptymalne
//        kontener[1] = kolo;
        Collection<Przechowywalna> kontener = new ArrayList<>(); //kolekcja, array znaczy "rządek" <> diamentowy operator
        // <> to znaczy, że wszystko to co jest w klasie collection jest TYPEM przechowywalna, trzeba powiedziec jaki to jest typ!!
        // COLLECTION JEST INTERFEJSEM, KTÓRY IMPLEMENTUJE KLASA ARRAYLIST!!!!!! CUDOWNE!
        System.out.println(kontener.size());
        System.out.println(kontener.add(kolo));
        System.out.println(kontener.size());
        System.out.println(kontener.add(prostokat));
        System.out.println(kontener.size());
        System.out.println(kontener.add(trojkat));
        System.out.println(kontener.size());


//        for (Przechowywalna figura: kontener) {
//            figura.
//        }
    }
    public static void wyswietlPolePowierzchni (Poleiczalna figurka) {
        System.out.println("nie wiem co to za figura, ale jej pole to: " + figurka.polePow());
    }

    public static void wyswietlObwód (Obwodoliczalna figurka) {
        System.out.println("nie wiem co to za figura, ale jej obwód to: " + figurka.obw());
    }

    public static void wyswietlWartosc (Przechowywalna figurka) {
        System.out.println("nie wiem co to za figura, ale jej obwód to: " + figurka);
    }

    //kolekcje - kontenery gdzie ładujemy obiekty a potem z nich korzystamy
}
