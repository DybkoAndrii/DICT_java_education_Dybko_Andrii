package ChatBot;

import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        System.out.println("Hello! My name is Chmon`a.");
        System.out.print("I was created in 2022.\n" + "Please, remind me your name. ");
        Scanner userInput = new Scanner(System.in);
        String Name = userInput.nextLine();
        System.out.println("What a great name you have, " + Name + "!");
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int rm3 = userInput.nextInt();
        int rm5 = userInput.nextInt();
        int rm7 = userInput.nextInt();
        int age = (rm3 * 70 + rm5 * 21 + rm7 * 15) % 105;
        System.out.println("Your age is " + age +"; that`s a good time to start programming!");
        System.out.println("Now I will prove to you that I can count to any number you want");
        int br = userInput.nextInt();
        for(int i = 0; i < br + 1; i++) {
            System.out.println(i + " !");
        }
        System.out.println("let's test your belonging to azov");
        System.out.println("Gde vy byli 8 let?");
        System.out.println("1. Igral v genshin.");
        System.out.println("2. Uchils`a");
        System.out.println("3. Dombil Bombas");
        System.out.println("4. Doma");
        int ans = userInput.nextInt();
        while (ans != 3) {
            System.out.println("Please, try again.");
            ans = userInput.nextInt();
        }
        System.out.println("Great, you right!");
        System.out.println("Goodbye, have a nice day!");
    }
}
