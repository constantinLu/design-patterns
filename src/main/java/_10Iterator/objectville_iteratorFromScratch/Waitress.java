package _10Iterator.objectville_iteratorFromScratch;

import _10Iterator.objectville_iteratorFromScratch.iterator.Iterator;
import _10Iterator.objectville_iteratorFromScratch.menu.DinerMenu;
import _10Iterator.objectville_iteratorFromScratch.menu.MenuItem;
import _10Iterator.objectville_iteratorFromScratch.menu.PancakeHouseMenu;

/**
 * To see why having two different menu representations complicates things,
 * let’s try implementing a client that uses the two menus. Imagine you have
 * been hired by the new company formed by the merger of the DinerMenu and the
 * Pancake House to create a Java-enabled waitress (this is Objectville, after
 * all). The spec for the Java-enabled waitress specifies that she can print a
 * custom menu for customers on demand, and even tell you if a menu item is
 * vegetarian without having to ask the cook — now that’s an innovation!
 */
public class Waitress {

    String name;

    PancakeHouseMenu pancakeHouseMenu;

    DinerMenu dinerMenu;

    public Waitress(String name, PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.name = name;
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }


    /**
     * prints every item on the menu
     */
    public void printMenu() {
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();

        System.out.println("MENU\n----------\nBREAKFAST");
        printMenu(pancakeIterator);
        System.out.println("\nLUNCH");
        printMenu(dinerIterator);
    }


    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName() + " , ");
            System.out.print(menuItem.getPrice() + "-- ");
            System.out.println(menuItem.getDescription());
        }
    }



    /**
     * prints just breakfast items
     */
    private void printBreakfastMenu(){

    }

    /**
     * prints just lunch menus
     */
    private void printLunchMenu() {

    }

    /**
     * prints only vegetarian menues
     */
    private void printVegetarianMenu() {

    }

    /**
     * given the name of an item
     * @return true if the items is vegetarian, otherwise return false;
     */
    private boolean isItemVegetarian(String name) {
        return true;
    }



}
