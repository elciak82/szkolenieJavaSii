package pl.polimorfizmZadania;

public class Kwadrat extends Figura {
     int bokA;
     int bokB;

    Kwadrat(int bokA, int bokB) {
        this.bokA = bokA;
        this.bokB = bokB;
    }

    public int getBokA() {
        return bokA;
    }

    @Override
    public int obliczObwod() {
        return 2 * (bokA + bokB);
    }

    @Override
    public int obliczPole() {
        return bokA * bokB;
    }
}
