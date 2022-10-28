package Hangman;

import java.util.Scanner;

public class hangman {
    public static void main(String[] args){
        System.out.print("HANGMAN\nGuess the word: ");
        String[] words = new String[]{"python", "java", "javascript", "kotlin"};
        int n = (int)Math.floor(Math.random() * words.length);
        Scanner userInput = new Scanner(System.in);
        if (userInput.nextLine().equals(words[n])){
            System.out.println("You survived!");
        } else {
            System.out.println("You lost!");
        }
    }
}
