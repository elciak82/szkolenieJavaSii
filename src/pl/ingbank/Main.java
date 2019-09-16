package pl.ingbank;

public class Main {
    public static void main(String[] args) {
        int liczba = 6;
        int liczbaDruga = 2;
//        boolean czyPrawda = liczba > liczbaDruga;
        if(false == false){
            System.out.println("1prawda");
        } else {
            System.out.println("1fałsz");
        }

        if(!true){
            System.out.println("2prawda");
        } else {
            System.out.println("2fałsz");
        }

        if(3==3 && 3==4){
            System.out.println("3prawda");
        } else {
            System.out.println("3fałsz");
        }

        if(3!=5 || 3==5){
            System.out.println("4prawda");
        } else {
            System.out.println("4fałsz");
        }

        if((2+4)>(1+3)){
            System.out.println("5prawda");
        } else {
            System.out.println("5fałsz");
        }

        if("coś" == "coś"){
            System.out.println("6prawda");
        } else {
            System.out.println("6fałsz");
        }
//        System.out.println("Hello world!");
//        System.out.println(text);
//        System.out.println(text + liczba);
    }
}