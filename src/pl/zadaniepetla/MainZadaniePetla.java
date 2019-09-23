package pl.zadaniepetla;

public class MainZadaniePetla {
    public static void main(String[] args) {
        int count = 110;
        int suma = 0;
//        int i = 0;
//        while (i <= count) {
//            suma = suma + i++;
//        }
//        System.out.println("suma: " + suma);

        for (int i = 0; i <= count; i++){
            suma = suma + i;
        }
        System.out.println("suma: " + suma);
    }
}

