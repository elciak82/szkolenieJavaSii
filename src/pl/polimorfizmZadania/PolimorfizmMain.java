package pl.polimorfizmZadania;

public class PolimorfizmMain {
    public static void main(String[] args) {
        Prostokat prostokat = new Prostokat(2, 3);
        Trojkat trojkat = new Trojkat(2, 3, 4, 2);

        FiguraGeometryczna[] figury = {prostokat, trojkat};

        for (FiguraGeometryczna figura : figury) { //dla każdej figury z tablicy oblcz pole i obwód
            System.out.println(figura.getClass().getSimpleName() + ": obwód " + figura.obw());
            System.out.println(figura.getClass().getSimpleName() + ": pole " +figura.polePow());
        }
    }
}

//nie można powołać instancji klasy abstrakcyjnej


//klasa kwadrat, któr a w konstr przyjmie 2 parametry
//którymi sa dł boków a i b
//utw klasę prostokąt w konstr 2 parametry dlugość a i b
//3,w klasie kw napisz met abstr która liczy pole pow
//4. w kl kw napisz met abstr, która wymusi implement metody obliczającej obwód