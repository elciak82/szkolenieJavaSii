package pl.klasy;

public class MainClass {
    public static void main(String[] args) {
//        MyClass myClass = new MyClass(); // new MyClass + Alt + Enter -> pojawi się deklaracja zmiennej, MyClass to konstruktor
//        System.out.println(myClass.field);
//        myClass.field = "Możemy przypisac inną wartość";
//        System.out.println(myClass.field);
        FirstPerson person = new FirstPerson("Michał", "Kowalski", 1990);
        System.out.println(person.getName() + " " + person.getSurname() + " " + person.getAge());
//        System.out.println(person.getAge());
//        person.setAge(25); //wiek jest ustawiony i setter jest niepotrzebny
//        System.out.println(person.getAge());
        FirstPerson.year = 2025; // taz zmiana nastapila w klasie person a nie w obiekcie klasy person, została nadpisana

        FirstPerson person2 = new FirstPerson("Michał", "Kowalski", 1990);
        System.out.println(person2.getName() + " " + person2.getSurname() + " " + person2.getAge());
        System.out.println(person.year);
        //prymityw to zmienne pisane małą literą:  int, byte etc -> nie przyjmuja null
        //myk potrzebny do rozwiązania zadania
    }

    //klasa jest pewnym schematem tworzenia, coś się zmienia w klasie to zmienia sie w całym porjekcie
    //singleton - wzorzec projektowy
//    akcesory - public -
//               protected -
//               private
}
