package ChatBot;

import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        System.out.println("Hello! My name is Chmon`a.");
        System.out.print("I was created in 2022.\n" + "Please, remind me your name. ");
        Scanner userInput = new Scanner(System.in);
        String Name = userInput.nextLine();
        System.out.println("What a great name you have, " + Name + "!");
    }
}
