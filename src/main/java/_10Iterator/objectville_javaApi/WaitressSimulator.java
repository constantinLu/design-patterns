package _10Iterator.objectville_javaApi;

import _10Iterator.objectville_javaApi.menu.DinerMenu;
import _10Iterator.objectville_javaApi.menu.PancakeHouseMenu;

public class WaitressSimulator {

    public static void main(String[] args) {

        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();

        DinerMenu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress("Lucy", pancakeHouseMenu, dinerMenu);

        waitress.printMenu();

    }
}
