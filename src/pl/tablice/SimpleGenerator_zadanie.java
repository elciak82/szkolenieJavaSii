package pl.tablice;

import java.util.Random;
import java.util.Scanner;
//TODO
public class SimpleGenerator_zadanie {
    public static void main(String[] args) {
        System.out.println("Proszę podać długość hasła: ");
        Scanner scanner = new Scanner(System.in);
        int passwordLen = scanner.nextInt();
//        char[] password = new char[passwordLen];
//        char[] asciiList = new char[]{80, 90};
//        losowanieZnaków(asciiList, passwordLen);
        char start = 97;
        char end = 122;
        char[] cccc = asciiArray(start, end);
//        System.out.println();


    }

    private static char[] losowanieZnaków(char[] acsiiList, int passwordLen) {
        char[] passwordArray = new char[passwordLen];
        Random random = new Random();

        for (int i = 1; i < passwordLen; i++) {
            passwordArray[i] = (char) random.nextInt(acsiiList.length);
        }
        for (char element : passwordArray
        ) {
            System.out.println(element);

        }
        return passwordArray;

    }

    private static char[] asciiArray(char start, char end) {
        char len = (char) (end - start);
        char[] newAsciiArray = new char[]{len};
        for (int i = 0; i < len-1; i++) {
            for (char j = start; j <= end; j++) {
                newAsciiArray[i] = j;
            }
        }
        return newAsciiArray;
    }
}
