package pl.klasy;

public class MainClass {
    public static void main(String[] args) {
//        MyClass myClass = new MyClass(); // new MyClass + Alt + Enter -> pojawi się deklaracja zmiennej, MyClass to konstruktor
//        System.out.println(myClass.field);
//        myClass.field = "Możemy przypisac inną wartość";
//        System.out.println(myClass.field);

        FirstPerson person = new FirstPerson("Michał", "Kowalski", 1990);

        System.out.println(person.getName() + " " + person.getSurname() + " " + person.getWiek());

        System.out.println(person.getWiek());

        person.setWiek(25); //wiek jest ustawiony i setter jest niepotrzebny

        System.out.println(person.getWiek());
        //prymityw to zmienne pisane małą literą:  int, byte etc -> nie przyjmuja null
        //myk potrzebny do rozwiązania zadania
    }
}
