package CoffeeMachine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has:");
        int water = input.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int milk = input.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int coffee = input.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        int cups = input.nextInt();
        CoffeeMachine machine = new CoffeeMachine(cups, water, milk, coffee);
        machine.info();
    }
}
