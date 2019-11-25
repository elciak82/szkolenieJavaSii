package pl.polimorfizm;

public class Main { //polimorfizm
    public static void main(String[] args) {
//        Ssak czlowiek = new Czlowiek();
//        Ssak piesel = new Piesel();
//
//        czlowiek.ssij();
//        piesel.ssij();
//
//        czlowiek.rupKupe();
//        piesel.rupKupe();

        Ssak[] ssaki = {new Czlowiek(), new Piesel()}; //tablica obiektów -> to samo co powyżej

        for (Ssak ssak:ssaki) {
            ssak.ssij();
        }
        for (Ssak ssak:ssaki) {
            ssak.rupKupe();

        }
    }
}
