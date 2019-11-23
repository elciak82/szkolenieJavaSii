package pl.klasy;

class MyClass {

    String field;

    //konstruktory to metody, które nie zwracają wartości, tylko tworza obiekt
    //obiekt można powołac do życia tylko poprzez użycie konstruktora
    //konstruktor jest wywoływany podczas tworzenia obiektu

    //Każda klasa dziedziczy po klasie Object - korzeń drzewa class
    MyClass() {
        System.out.println("Siema z konstruktora klasy MyCalss");
        this.field = "Jakaś domyslna wartość";
        myMethod();
    }

    private void myMethod() {
        System.out.println("Siema z metody klasy MyClass");
    }
}
