package pl.polimorfizmZadania;

public class Prostokat extends Kwadrat {

    Prostokat(int bokA, int bokB) {
        super(bokA,bokB);
    }

    @Override
    public int obliczPole() {
        bokA = getBokA();
        bokB = getBokB();
        return bokA * bokB;
    }

    @Override
    public int obliczObwod() {
        return 2 * (bokA + bokB);
    }

    @Override
    public int getBokA() {
        return bokA;
    }

    public int getBokB() {
        return bokB;
    }




}
