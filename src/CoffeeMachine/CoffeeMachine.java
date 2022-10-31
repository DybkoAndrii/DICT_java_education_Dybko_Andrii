package CoffeeMachine;

import java.util.Scanner;

public class CoffeeMachine {
    public void info(){
        System.out.println("Write how many cups of coffee you will need: ");
        Scanner userInput = new Scanner(System.in);
        int caps = userInput.nextInt();
        System.out.printf("""
                For %d cups of coffee you will need:
                %d ml of water
                %d ml of milk
                %d g of coffee beans""", caps, caps * 200, caps * 50, caps * 15);
    }
}
