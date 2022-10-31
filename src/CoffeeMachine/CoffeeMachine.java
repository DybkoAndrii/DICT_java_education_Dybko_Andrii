package CoffeeMachine;

import java.util.Scanner;

public class CoffeeMachine {
    private int water, milk, coffee, cups, money;

    public CoffeeMachine(int cups, int water, int milk, int coffee, int money){
        this.cups = cups;
        this.water = water;
        this.milk = milk;
        this.coffee = coffee;
        this.money = money;
    }

    public void espresso(){
        cups -= 1;
        water -= 250;
        money += 4;
    }

    public void latte(){
        cups -= 1;
        water -= 350;
        milk -= 75;
        coffee -= 20;
        money += 7;
    }

    public void cappuccino(){
        cups -= 1;
        water -= 200;
        milk -= 100;
        coffee -= 12;
        money += 6;
    }

    public void fill(){
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

    public void take(){
        System.out.printf("""
                I gave you %d
                
                """, money);
        money = 0;
    }

    public void info(){
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
