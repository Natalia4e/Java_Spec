package HomeWorkOne;
// создаем интерфейс VendingMachine и определяем 2 метода
public interface VendingMachine {
    HotDrink getProduct(String name);
    HotDrinkWithTemp getProduct(String name, int volume, int temperature);
}
