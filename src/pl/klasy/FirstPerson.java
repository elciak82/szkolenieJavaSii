package pl.klasy;

class FirstPerson {
    private int age;
    private String name;
    private String surname;
    private Integer wiek;
    private int year;
    private int yearOfBirth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getWiek() {
        return this.age = year - yearOfBirth; //2 rozwiązanie - tego settera można usunąć, bo wiek jest wykiczany i nie można go ustawić
    }

    public void setWiek(Integer wiek) {
        this.wiek = wiek;
    }

    FirstPerson(String imie, String nazwisko, int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
        this.name = imie; //przesłanianie
        this.surname = nazwisko;
        this.year = 2019;
        this.age = year - yearOfBirth; //1 rozwiązanie

        //enkapcukacja - na zewnątrz klasy wystawiac tylko to, co jest niezbędnie koniecznie
    }
}
