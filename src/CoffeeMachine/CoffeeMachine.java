package CoffeeMachine;

import java.util.Scanner;

public class CoffeeMachine {
    private int water, milk, coffee, cups, money;

    public void menu(String answer){
        switch (answer) {
            case "buy" -> buy();
            case "fill" -> fill();
            case "take" -> take();
            case "remaining" -> info();
            default -> System.out.println("ERROR");
        }
    }

    private void buy(){
        Scanner input = new Scanner(System.in);
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu");
        String answer = input.nextLine();
        switch (answer) {
            case "1" -> espresso();
            case "2" -> latte();
            case "3" -> cappuccino();
            case "back" -> System.out.println(" ");
            default -> System.out.println("ERROR");
        }
    }

    public CoffeeMachine(int cups, int water, int milk, int coffee, int money){
        this.cups = cups;
        this.water = water;
        this.milk = milk;
        this.coffee = coffee;
        this.money = money;
    }

    private void espresso(){
        if (make_coffee(250, 0, 16).equals("has")){
            cups -= 1;
            water -= 250;
            coffee -= 16;
            money += 4;
            System.out.println("I have enough resources, making you a espresso!");
        }else
            System.out.printf("%s\n", make_coffee(250, 0, 16));
    }

    private void latte(){
        if (make_coffee(350, 75, 20).equals("has")) {
            cups -= 1;
            water -= 350;
            milk -= 75;
            coffee -= 20;
            money += 7;
            System.out.println("I have enough resources, making you a latte!");
        }else
            System.out.printf("%s\n", make_coffee(350, 75, 20));
    }

    private void cappuccino(){
        if (make_coffee(200, 100, 12).equals("has")) {
            cups -= 1;
            water -= 200;
            milk -= 100;
            coffee -= 12;
            money += 6;
            System.out.println("I have enough resources, making you a cappuccino!");
        }else
            System.out.printf("%s\n", make_coffee(200, 100, 12));
    }

    private void fill(){
        Scanner input = new Scanner(System.in);
        System.out.println("Write how many ml of water you want to add:");
        water += input.nextInt();
        System.out.println("Write how many ml of milk you want to add:");
        milk += input.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add:");
        coffee += input.nextInt();
        System.out.println("Write how many disposable coffee cups you want to add:");
        cups += input.nextInt();
    }

    private void take(){
        System.out.printf("""
                I gave you %d
                
                """, money);
        money = 0;
    }

    private String make_coffee(int wt, int mlk, int cfe){
        String isHasSours = "has";
        if (water < wt)
            isHasSours = "Sorry, not enough water!";
        else if (milk < mlk) {
            isHasSours = "Sorry, not enough milk!";
        } else if (coffee < cfe) {
            isHasSours = "Sorry, not enough coffee beans!";
        } else if (cups - 1 < 0) {
            isHasSours = "Sorry, not enough disposable cups!";
        } return isHasSours;
    }

    private void info(){
        System.out.printf("""
                The coffee machine has:
                %d of water
                %d of milk
                %d of coffee beans
                %d of disposable cups
                %d of money
                """, water, milk, coffee, cups, money);
    }
}
