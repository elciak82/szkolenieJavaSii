package pl.ingbank;


public class HelloWorld {
    public static void main(String[] args) {
        String imie = "Bartek";
        String nazwisko = "Walczak";
        int wiek = 17;
        String urodziny = "18 sierpnia";

        System.out.println(imie + " " + nazwisko + " ma " + wiek + " lat. Urodziny obchodzi " + urodziny + ".");
        int a = 10 / 5 * 3;
        double b = 10.6;
        double c = 19.5;

        for (int i = 0; i < 7; i++) {
            System.out.println(a + b + c);
        }

        int j = 0;
        while (j <= 5) {
            System.out.println("Jestem w petli.");
            j++;
        }
    }
}
