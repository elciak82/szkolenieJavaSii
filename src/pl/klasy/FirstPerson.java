package pl.klasy;

class FirstPerson {
    private String name;
    private String surname;
    private Integer age;
    public static int year = 2019; //należy do klasy a nie do obiektu - rok został zmieniony w "locie"
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

    public Integer getAge() {
        return this.age = year - yearOfBirth; //2 rozwiązanie - tego settera można usunąć, bo wiek jest wykiczany i nie można go ustawić
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    FirstPerson(String imie, String nazwisko, int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
        this.name = imie; //przesłanianie
        this.surname = nazwisko;
//        this.year = 2019;
//        this.age = year - yearOfBirth; //1 rozwiązanie

        //enkapcukacja - na zewnątrz klasy wystawiac tylko to, co jest niezbędnie koniecznie
    }
}
