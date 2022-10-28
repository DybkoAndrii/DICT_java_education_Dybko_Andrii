package Hangman;

import java.util.Scanner;

public class hangman {
    public static void main(String[] args){
        System.out.print("HANGMAN\nGuess the word: ");
        Scanner userInput = new Scanner(System.in);
        if (userInput.nextLine().equals("java")){
            System.out.println("You survived!");
        } else {
            System.out.println("You lost!");
        }
    }
}
