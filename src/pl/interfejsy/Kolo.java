package pl.interfejsy;

public class Kolo implements Poleiczalna, Obwodoliczalna, Przechowywalna {
    @Override
    public int obw() {
        return 6;
    }

    @Override
    public int polePow() {
        return 12;
    }
}
