package pl.petlawhile;

public class MainWhileBreak { //nazwa klasy taka jak nazwa pliku
    public static void main(String[] args) {
        int i = 0;
        while (true) {
            if(i++ < 4) {
                System.out.println("Ewelina");
            } else {
                break;
//                return; //zakończy porgram, nie dojdzie do print - PRZERYWA ZWYKONANIE CAŁEJ METODY !!
            }
        }
        System.out.println("Jestem za pętlą"); //każda funkcja to podporgram. Porgram składa się z podprogramów
    }
}
