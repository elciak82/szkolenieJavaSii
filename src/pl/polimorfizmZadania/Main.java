package pl.polimorfizmZadania;

public class Main {
    public static void main(String[] args) {
        Figura prostokat = new Prostokat(2, 3);
        Figura kwadrat = new Prostokat(5, 5);

        System.out.println(prostokat.obliczObwod()); //10
        System.out.println(prostokat.obliczPole()); //6

        System.out.println(kwadrat.obliczObwod()); // 20
        System.out.println(kwadrat.obliczPole()); // 25
    }
}


//klasa kwadrat, któr a w konstr przyjmie 2 parametry
//którymi sa dł boków a i b
//utw klasę prostokąt w konstr 2 parametry dlugość a i b
//3,w klasie kw napisz met abstr która liczy pole pow
//4. w kl kw napisz met abstr, która wymusi implement metody obliczającej obwód