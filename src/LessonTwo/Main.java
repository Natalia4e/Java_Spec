package LessonTwo;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        human.name = "Петя";
//            human.setMakeOrder();
//            human.setTakeOrder();
//            human.isMakeOrder();
//            System.out.println(human.isMakeOrder());
//            human.isTakeOrder();
//            System.out.println(human.isTakeOrder());
        Market market = new Market();
        market.acceptToMarket(human);
        market.takeQueue(human);
        market.takeOrders();
        market.giveOrders();
        market.releaseFromQueue(human);
        market.releaseFromMarket(human);

    }
}