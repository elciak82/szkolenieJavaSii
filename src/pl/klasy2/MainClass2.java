package pl.klasy2;

public class MainClass2 {
    public static void main(String[] args) {
//        MyClass2 myClass = new MyClass2(); //jawne wywołanie konstruktora
//        System.out.println(myClass.name);
//        myClass.name = "inny text";
//        System.out.println(myClass.name);
        Student student = new Student("Ewe")
                .setAge(23)
                .setName("Bartek");

        System.out.println(student.getName());

    }
}
