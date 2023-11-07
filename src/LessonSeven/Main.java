package LessonSeven;

public class Main {
    public static void main(String[] args){
        Coffee coffee = new Coffee("Brasilian", 60.5, 0.3);
        CoffeeDecorator coffeeDecorator = new CoffeeDecorator(coffee, false, true);
        coffeeDecorator.printCoffee(coffee);
    }
}
