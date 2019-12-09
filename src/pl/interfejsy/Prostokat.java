package pl.interfejsy;

public class Prostokat implements Poleiczalna, Obwodoliczalna, Przechowywalna { //w porstokacie mozna policzyc pole powierzchni i obwód
    //dodanie intefjejsu wymusza na nas zmiane w api, czyli dodanie kolejneh metody

    private final int bokA;
    private final int bokB;

    public Prostokat(int bokA, int bokB) {
        this.bokA = bokA;
        this.bokB = bokB;
    }
    @Override
    public int obw() {
        return 2*(bokA * bokB);
    }

    @Override
    public int polePow() {
        return bokA * bokB;
    }
}
