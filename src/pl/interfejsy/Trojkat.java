package pl.interfejsy;

public class Trojkat implements Poleiczalna, Obwodoliczalna, Przechowywalna {
    @Override
    public int obw() {
        return 5;
    }

    @Override
    public int polePow() {
        return 10;
    }
}
