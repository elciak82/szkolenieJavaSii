package pl.klasyZadania;

import pl.klasy.OtherClass;

public class MainClass {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.setTextField("TEXT");
        System.out.println(myClass.getTextField());

        StringClass stringClass = new StringClass();
        System.out.println(stringClass.getName());

        OtherClass otherClass = new OtherClass();
        System.out.println(otherClass.getName());

        NewClass newClass = new NewClass();
        System.out.println(newClass.getEmpty()); //null

        System.out.println(stringClass.getName());
        StringClass stringClass1 = new StringClass("EWELINKA");
        System.out.println(stringClass1.getName());
    }
}
