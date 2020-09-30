package _10Iterator.objectville_javaApi.menu;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu {

    ArrayList<MenuItem> menuItems;


    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();

        addItem("K&B`s pancake Breakfast", "Pancakes with scrambled eggs and toast", true, 2.99);
        addItem("Regular pancake Breakfast", "Pancakes with fried eggs and sausage", false, 2.99);
        addItem("Blueberry pancake", "Pancakes made with fres blueberries", true, 3.49);
        addItem("Waffles", "Pancakes with choice of blueberries or strawberries", true, 3.59);

    }

    private void addItem(String name, String description, boolean vegetarian, double price) {

        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    @Deprecated
    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public Iterator createIterator() {
        return menuItems.iterator();
    }
}
