package HomeWorkOne;
// Расширяем HotDrink + доп поле temperature (наследование)
public class HotDrinkWithTemp extends HotDrink {
    protected int temperature;

    public HotDrinkWithTemp(String name, int volume, int temperature) {
        super(name, volume);
        this.temperature = temperature;
    }
}