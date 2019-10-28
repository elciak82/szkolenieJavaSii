package pl.tablice;

import java.util.Random;
import java.util.Scanner;

public class SimpleGeneratorMain {
    public static void main(String[] args) {
        char[] upperCase = new char[]{'A', 'B', 'C', 'D'};
        char[] lowerCase = new char[]{'a', 'b', 'c', 'd'};
        char[] digits = new char[]{'1', '2', '3', '4'};
        char[] spChar = new char[]{'!', '@', '%', '#'};
        System.out.println("Proszę podać długość hasła!");
        Scanner scanner = new Scanner(System.in);
        int passwordLen = scanner.nextInt();
        char[] password = new char[passwordLen];
        Random random = new Random();

        for(int i = 0; i < passwordLen; ++i) {
            int whichArray = random.nextInt(4);
            if (whichArray == 0) {
                password[i] = upperCase[random.nextInt(upperCase.length)];
            } else if (whichArray == 1) {
                password[i] = lowerCase[random.nextInt(lowerCase.length)];
            } else if (whichArray == 2) {
                password[i] = digits[random.nextInt(digits.length)];
            } else {
                password[i] = spChar[random.nextInt(spChar.length)];
            }
        }
        System.out.println(password); //char jest ok
    }
}
