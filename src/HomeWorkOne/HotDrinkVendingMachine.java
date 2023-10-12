package HomeWorkOne;
//HotDrinkVendingMachine реализует интерфейс VendingMachine
// getProduct(String name, int volume, int temperature) проходит через список drinks,
// ищет и возвращает напиток, который соответствует всем нашим параметрам.
import java.util.List;
public class HotDrinkVendingMachine implements VendingMachine {
    private List<HotDrinkWithTemp> drinks;

    public HotDrinkVendingMachine(List<HotDrinkWithTemp> drinks) {
        this.drinks = drinks;
}
    public HotDrink getProduct(String name) {
        return null;
    }
    public HotDrinkWithTemp getProduct(String name, int volume, int temperature) {
        for (HotDrinkWithTemp drink : drinks) {
            if (drink.name.equals(name) && drink.volume == volume && drink.temperature == temperature) {
                return drink;
            }
        }
        return null;
    }
}
