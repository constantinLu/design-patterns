package _10Iterator.objectville_iteratorFromScratch.menu;

import _10Iterator.objectville_iteratorFromScratch.iterator.DinerMenuIterator;
import _10Iterator.objectville_iteratorFromScratch.iterator.Iterator;

public class DinerMenu {

    private static final int MAX_ITEMS = 6;
    private int numberofItems = 0;
    private MenuItem[] menuItems;


    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];


        addItems("Steak", "Classic stake with a chose of sides ", false, 2.99);
        addItems("Ryb-eye with mashed patatos", "rare, medium or well done", false, 2.99);
        addItems("Salmon with vegetables", "wild salmon", true, 3.49);
        addItems("Tai food", "thai", true, 3.59);
    }

    private void addItems(String name, String description, boolean vegetarian, double price) {

        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberofItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full! Can`t add item to the menu.");
        } else {
            menuItems[numberofItems] = menuItem;
            numberofItems++;
        }
    }

    @Deprecated
    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    /**
     * we`re returning the Iterator interface. The client doesn`t need to know how the items are mantained in the DinerMenu
     * It just need to step through the items in the menu
     * @return
     */
    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
