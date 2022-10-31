package CoffeeMachine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CoffeeMachine machine = new CoffeeMachine(9, 400, 540, 120, 550);
        machine.info();
        System.out.println("Write action (buy, fill, take): ");
        String answer = input.nextLine();
        switch (answer) {
            case "buy" -> buy(machine);
            case "fill" -> machine.fill();
            case "take" -> machine.take();
            default -> System.out.println("ERROR");
        }
        machine.info();
    }

    private static void buy(CoffeeMachine machine){
        Scanner input = new Scanner(System.in);
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
        String answer = input.nextLine();
        switch (answer) {
            case "1" -> machine.espresso();
            case "2" -> machine.latte();
            case "3" -> machine.cappuccino();
            default -> System.out.println("ERROR");
        }
    }
}
