package _10Iterator.objectville_javaApi.menu;

import _10Iterator.objectville_javaApi.menu.MenuItem;
import java.util.Iterator;

public class DinerMenuIterator implements Iterator {

    MenuItem[] menuItems;
    // maintains the current position of the interation over the array
    int position = 0;


    // takes the array of menu items we are going to iterate over.
    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }


    @Override
    public boolean hasNext() {
        if (position >= menuItems.length || menuItems[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems[position];
        position++;
        return menuItem;
    }

    @Override
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException("You can`t remove an intem uite you`ve done at leas one next()");
        }

        if (menuItems[position - 1] != null) {
            for (int i = position - 1; i < menuItems.length - 1; i++) {
                menuItems[i] = menuItems[i + 1];
            }
            menuItems[menuItems.length - 1] = null;
        }
    }
}
