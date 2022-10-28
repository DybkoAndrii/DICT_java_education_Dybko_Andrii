package Hangman;

import java.util.Scanner;

public class hangman {
    public static void main(String[] args){
        System.out.println("HANGMAN");
        String[] words = new String[]{"python", "java", "javascript", "kotlin"};
        int n = (int)Math.floor(Math.random() * words.length);
        char[] chArray = words[n].toCharArray();
        System.out.print("Guess the word ");
        for (int i = 0; i < chArray.length; i++){
            if (i < 2){
                System.out.print(chArray[i]);
            }else {
                System.out.print('-');
            }
        }
        System.out.print(": ");
        Scanner userInput = new Scanner(System.in);
        if (userInput.nextLine().equals(words[n])){
            System.out.println("You survived!");
        } else {
            System.out.println("You lost!");
        }
    }
}
