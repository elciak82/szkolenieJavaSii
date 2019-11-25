package pl.polimorfizm;

public class Czlowiek extends Ssak{
    String imie;

    @Override
    public void ssij() { //
        System.out.println("Tu ssie człowiek"); //nadpisanie metody z klasy Ssij
                super.ssij(); //super oznacza że chodzi o klasę Ssak (tą po której dziedziczymy)
    }

    @Override
    public void rupKupe() {
        System.out.println("Człowiek siada na muszli");
    }
}
