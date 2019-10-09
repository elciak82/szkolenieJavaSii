package pl.zadaniepetla;

public class ZadanieDziesiate {

    private static int smallNumber = 0;
    private static int greatNumber = 4;
    private static String greater = "Podana liczba jest większa od: " + greatNumber;
    private static String inside = "Podana liczba jest większa od: " + smallNumber + ", ale mniejsza od: " + greatNumber;
    private static String ouside = "Podana liczba nie mieści się w przedziałach";

    public static void main(String[] args) {
        System.out.println(checkNumber(10));
    }

    private static String checkNumber(int checkedNumber) {
        if (checkedNumber > greatNumber) {
            return greater;
        } else if (smallNumber < checkedNumber && checkedNumber < greatNumber) {
            return inside;
        } else return ouside;
    }
}

//10.	Napisz taki program, który sprawdzi czy zaczytana liczba jest większa od 4
// i wypisze na konsolę: „Podana liczba jest większa od 4”, jeżeli nie jest,
// to sprawdzi czy liczba mieści się w przedziale <1 – 4) i wypisze: „Liczba jest mniejsza od 4,
// ale większa od 1”, jeżeli nie, to program wypisze na konsolę: „Podana liczba nie mieści się w przedziałach”
