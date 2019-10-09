package pl.zadaniepetla;

public class Zadania8_9 {

    private static String pass = "OK";
    private static String fail = "warunek niespełniony";

    public static void main(String[] args) {
        System.out.println(checkConditionA(2, 3));
        System.out.println(checkConditionB(4, 5));
        System.out.println(checkConditionC(2, 2));
        System.out.println(checkConditionD(2, 2));
        System.out.println(checkConditionModulo(9, 2, 0));
        System.out.println(checkConditionModulo(9, 3, 0));
        System.out.println(checkConditionModulo(7, 2, 1));
        System.out.println(checkConditionEvenNumber(101));
    }

    private static String checkConditionA(int number1, int number2) {
        if (number1 > number2) {
            return (pass);
        }else return (fail);
    }

    private static String checkConditionB(int number1, int number2) {
        if (number1 < number2) {
            return (pass);
        }else return (fail);
    }

    private static String checkConditionC(int number1, int number2) {
        if ((number1 - number2) == 0) {
            return (pass);
        }else return (fail);
    }

    private static String checkConditionD(int number1, int number2) {
        if (number1 == number2) {
            return (pass);
        } else return (fail);
    }

    private static String checkConditionModulo(int number1, int number2, int number3) {
        if (number1 % number2 == number3) {
            return (pass);
        } else return (fail);
    }

    private static String checkConditionEvenNumber(int number1) {
        if (number1 % 2 == 0) {
            return (pass);
        } else return (fail);
    }

}


//    Napisz program, który sprawdza poniższe warunki i przy spełnieniu warunku wypisuje na konsolę: „OK!”
//        a.	2 > 3
//        b.	4 < 5
//        c.	(2 – 2) == 0
//        d.	True
//        e.	9 % 2 == 0
//        f.	9 % 3 == 0
//        g.	7 % 2 == 1
//        h.	*Sprawdź, czy podana liczba jest parzysta
//        9.	Rozbuduj poprzedni program tak, by wypisywał „warunek niespełniony” w przypadku niespełnienia warunku.
