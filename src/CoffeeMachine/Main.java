package CoffeeMachine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CoffeeMachine machine = new CoffeeMachine(9, 400, 540, 120, 550);
        System.out.println("Write action (buy, fill, take, remaining, exit): ");
        String answer = input.nextLine();
        while (!answer.equals("exit")){
            machine.menu(answer);
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            answer = input.nextLine();
        }
    }
}
