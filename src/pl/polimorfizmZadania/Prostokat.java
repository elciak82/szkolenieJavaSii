package pl.polimorfizmZadania;

public class Prostokat implements FiguraGeometryczna {

    private final int bokA;
    private final int bokB;

    public Prostokat(int bokA, int bokB) {
        this.bokA = bokA;
        this.bokB = bokB;
    }


    @Override
    public int obw() {
        return 2*(bokA + bokB);
    }

    @Override
    public int polePow() {
        return bokA * bokB;
    }
}
