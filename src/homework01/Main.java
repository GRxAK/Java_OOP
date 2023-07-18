package homework01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HotDrink drink01 = new HotDrink("Экспессо", 10, 90, 50);
        HotDrink drink02 = new HotDrink("Латте", 20, 80, 200);
        HotDrink drink03 = new HotDrink("Капучино", 25, 80, 250);
        HotDrink drink04 = new HotDrink("Чай с лемоном", 15, 70, 200);
        HotDrink drink05 = new HotDrink("Зеленый чай", 10, 60, 200);
        HotDrink drink06 = new HotDrink("Травеной чай", 17, 90, 250);
        HotDrink drink07 = new HotDrink("Экспессо", 10, 90, 50);
        HotDrink drink08 = new HotDrink("Глессе", 18, 80, 200);

        List<Product> list = new ArrayList<>();
        list.add(drink01);
        list.add(drink02);
        list.add(drink03);
        list.add(drink04);
        list.add(drink05);
        list.add(drink06);
        list.add(drink07);
        list.add(drink08);

        HotDrinkVendingMachine machine = new HotDrinkVendingMachine(list);

        System.out.println(machine.getProduct("Глессе"));
        System.out.println(machine.getProduct("Экспессо"));
    }
}
