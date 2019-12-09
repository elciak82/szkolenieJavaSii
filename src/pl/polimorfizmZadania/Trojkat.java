package pl.polimorfizmZadania;

public class Trojkat implements FiguraGeometryczna {

    private final int a;
    private final int b;
    private final int c;
    private final int h;

    public Trojkat(int a, int b, int c, int h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    @Override
    public int obw() {
        return a + b + c;
    }

    @Override
    public int polePow() {
        return (a * h) / 2;
    }
}
