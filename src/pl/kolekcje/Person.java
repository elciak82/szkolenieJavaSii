package pl.kolekcje;

public class Person {
    private String imie;
    private String nazwisko;

    public String getImie() {
        return imie;
    }

    public Person setImie(String imie) {
        this.imie = imie;
        return this;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public Person setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
        return this;
    }

    public Person (String imie, String nazwisko){
        this.imie = imie;
        this.nazwisko = nazwisko;

    }
}
