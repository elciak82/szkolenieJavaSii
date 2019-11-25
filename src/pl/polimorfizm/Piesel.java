package pl.polimorfizm;

public class Piesel extends Ssak{
    String imie;

    @Override
    public void ssij() {
//        super.ssij();
        System.out.println("Tu ssie piesek");
    }

    @Override
    public void rupKupe() {
        System.out.println("Piesek ogarnia się na trawce");
    }
}
