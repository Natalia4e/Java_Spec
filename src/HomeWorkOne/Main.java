//Создать наследника реализованного класса ГорячийНапиток
// с дополнительным полем int температура.
//Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат
// и реализовать перегруженный метод getProduct(int name, int volume, int temperature),
// выдающий продукт соответствующий имени, объёму и температуре
// В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат
// и воспроизвести логику, заложенную в программе
// Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре

package HomeWorkOne;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<HotDrinkWithTemp> drinks = Arrays.asList(
                new HotDrinkWithTemp("Tea", 300, 80),
                new HotDrinkWithTemp("Coffee", 250, 90)
        );

        HotDrinkVendingMachine machine = new HotDrinkVendingMachine(drinks);

        HotDrinkWithTemp requestedDrink = machine.getProduct("Tea", 300, 80);
        if (requestedDrink != null) {
            System.out.println("Here is your hot drink: " + requestedDrink.name);
        } else {
            System.out.println("Sorry, we don't have the requested drink.");
        }
    }
}
