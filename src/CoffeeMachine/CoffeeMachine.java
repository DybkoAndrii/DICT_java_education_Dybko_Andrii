package CoffeeMachine;

public class CoffeeMachine {
    private final int water;
    private final int milk;
    private final int coffee;
    private final int cups;

    public CoffeeMachine(int cups, int water, int milk, int coffee){
        this.cups = cups;
        this.water = water;
        this.milk = milk;
        this.coffee = coffee;
    }

    public void info(){
        int num = (int) Math.floor(Math.min(water/200, Math.min(milk/50, coffee/15)));
        if (num == cups)
            System.out.println("Yes, I can make that amount of coffee");
        else if (num > cups) {
            System.out.printf("Yes, I can make that amount of coffee (and even %d more than that)", num-cups);
        } else
            System.out.printf("No, I can make only %d cups of coffee", num);
    }
}
