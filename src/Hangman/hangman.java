package Hangman;

import java.util.Arrays;
import java.util.Scanner;

public class hangman {
    public static void main(String[] args){
        System.out.println("HANGMAN");
        String[] words = new String[]{"python", "java", "javascript", "kotlin"};
        int n = (int)(Math.random() * words.length);
        char[] chArray = words[n].toCharArray();
        char[] userChArray = new char[chArray.length];
        for (int i = 0; i < chArray.length; i++){
            userChArray[i] = '-';
        }
        Scanner userInput = new Scanner(System.in);
        byte healthPoint = 8;
        while (healthPoint > 0){
            for (int i = 0; i < chArray.length; i++) {
                System.out.print(userChArray[i]);
            }
            if (Arrays.equals(chArray, userChArray)){
                System.out.println("\nYou guessed the word!");
                break;
            }
            System.out.println(' ');
            System.out.print("Input a letter: ");
            char userChar = userInput.nextLine().toCharArray()[0];
            if (checkChar(userChar, userChArray) == 1){
                System.out.println("No improvements");
                healthPoint--;
            } else if (checkChar(userChar, chArray) == 0) {
                System.out.println("That letter doesn't appear in the word");
                healthPoint--;
            }
            for (int i = 0; i < chArray.length; i++){
                if (chArray[i] == userChar){
                    userChArray[i] = userChar;
                }
            }
        }
        if (healthPoint == 0)
            System.out.println("Deti Donbasa zakidali vas palkami");
        else
            System.out.println("You survived!");
    }

    public static byte checkChar(char usInp, char[] chArr){
        byte j = 0;
        for (char i : chArr){
            if (i == usInp)
                j++;
        }
        return j;
    }
}
