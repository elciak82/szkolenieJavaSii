package pl.petlawhile;

public class MainWhile {
    public static void main(String[] args) {
//        while(false) { petla się nigdy nie wykona
//        while(true) { niekończąca się pętla
        int i = 0; //typ i nazwa zmiennej - i przechowuje liczny całkowice
        while(i < 5){ // potrzebujemy warunku
            System.out.println(i++);
            System.out.println("Ewelina");
            ++i; //++ z prawej czy z lewej ++i najpierw dodaj 1 a potem rób co chcesz, i++ zrób co chcesz a potem dodaj 1
        }
//        i = 0; // i juz przechowywuje jakąś zmienna ale przypisujemy do niej 0
        int iTwo = 11;
        do {
            System.out.println(iTwo++);
            System.out.println("EWWA");
        } while (iTwo < 10);
    }
}
