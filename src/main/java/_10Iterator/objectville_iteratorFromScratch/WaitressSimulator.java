package _10Iterator.objectville_iteratorFromScratch;

import _10Iterator.objectville_iteratorFromScratch.menu.DinerMenu;
import _10Iterator.objectville_iteratorFromScratch.menu.PancakeHouseMenu;

public class WaitressSimulator {

    public static void main(String[] args) {

        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();

        DinerMenu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress("Lucy", pancakeHouseMenu, dinerMenu);

        waitress.printMenu();

    }
}
