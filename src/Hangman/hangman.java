package Hangman;

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
        for (int j = 0; j < 8; j++) {
            for (int i = 0; i < chArray.length; i++) {
                System.out.print(userChArray[i]);
            }
            System.out.println(' ');
            System.out.print("Input a letter: ");
            char userChar = userInput.nextLine().toCharArray()[0];
            int b = 0;
            for (int i = 0; i < chArray.length; i++){
                if (chArray[i] == userChar){
                    userChArray[i] = userChar;
                    b++;
                }
            } if (b == 0){
                System.out.println("That letter doesn't appear in the word");
            }
        }
        System.out.println("Thanks for playing!\nWe'll see how well you did in the next stage");
    }
}
