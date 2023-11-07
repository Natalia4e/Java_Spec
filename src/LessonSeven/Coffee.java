package LessonSeven;
// Написать класс кофе с несколькими полями и создать декоратор для возможности добавления
// в кофе сахар/сиропов
public class Coffee {
    private String type;
    private double temp;
    private double volume;

    // alt + insert Constructor
    public Coffee(String type, double temp, double volume) {
        this.type = type;
        this.temp = temp;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "type='" + type + '\'' +
                ", temp=" + temp +
                ", volume=" + volume +
                '}';
    }
}
class CoffeeToCoffeeDecorator {
    protected Coffee coffee;
    protected boolean sugar;
    protected boolean syrup;

    public CoffeeToCoffeeDecorator(Coffee coffee, boolean sugar, boolean syrup) {
        this.coffee = coffee;
        this.sugar = sugar;
        this.syrup = syrup;
    }
}

class CoffeeDecorator extends CoffeeToCoffeeDecorator{
    public CoffeeDecorator (Coffee coffee, boolean sugar, boolean syrup){
        super(coffee, sugar, syrup);
    }
    public void printCoffee(Coffee coffee){
        System.out.println(coffee + "sugar " + sugar + " syrup " + syrup);
    }
}
