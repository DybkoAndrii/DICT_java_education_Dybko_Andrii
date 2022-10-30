package Hangman;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class hangman {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        while (true) {
            System.out.println("Type 'play' to play the game, 'exit' to quit: ");
            String action = userInput.nextLine();
            if (action.equals("play"))
                game();
            else if (action.equals("exit")) {
                break;
            }else
                System.out.println("ERROR");
        }
    }

    public static void game(){
        System.out.println("HANGMAN");
        String[] words = new String[]{"python", "java", "javascript", "kotlin"};
        Scanner userInput = new Scanner(System.in);
        int n = (int) (Math.random() * words.length);
        char[] chArray = words[n].toCharArray();
        char[] userChArray = new char[chArray.length];

        HashSet<Character> userTry = new HashSet<>();
        for (int i = 0; i < chArray.length; i++) {
            userChArray[i] = '-';
        }
        byte healthPoint = 8;

        while (healthPoint > 0) {
            for (int i = 0; i < chArray.length; i++) {
                System.out.print(userChArray[i]);
            }
            System.out.println(' ');
            if (Arrays.equals(chArray, userChArray)) {
                System.out.println("You survived!");
                break;
            }
            System.out.print("Input a letter: ");
            char[] inputArr = userInput.nextLine().toCharArray();
            char userChar = inputArr[0];
            if (inputArr.length < 2) {
                if (String.valueOf(userChar).toLowerCase().equals(String.valueOf(userChar))) {
                    if (checkChar(userChar, userChArray) == 1 || userTry.contains(userChar)) {
                        System.out.println("You've already guessed this letter.");
                    } else if (checkChar(userChar, chArray) == 0) {
                        System.out.println("That letter doesn't appear in the word");
                        healthPoint--;
                    }
                    userTry.add(userChar);
                } else
                    System.out.println("Please enter a lowercase English letter");
            } else
                System.out.println("You should input a single letter");

            for (int i = 0; i < chArray.length; i++) {
                if (chArray[i] == userChar)
                    userChArray[i] = userChar;
            }
            if (healthPoint == 0)
                System.out.println("Deti Donbasa zakidali vas palkami");
        }
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
