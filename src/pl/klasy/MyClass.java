package pl.klasy;

class MyClass {

    String field;

    //konstruktory to metody, które nie zwracają wartości
    MyClass() {
        System.out.println("Siema z konstruktora klasy MyCalss");
        this.field = "Jakaś domyslna wartość";
        myMethod();
    }

    private void myMethod() {
        System.out.println("Siema z metody klasy MyClass");
    }
}
