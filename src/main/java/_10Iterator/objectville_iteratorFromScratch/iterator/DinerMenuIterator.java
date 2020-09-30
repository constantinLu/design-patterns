package _10Iterator.objectville_iteratorFromScratch.iterator;

import _10Iterator.objectville_iteratorFromScratch.menu.MenuItem;


public class DinerMenuIterator implements Iterator {

    MenuItem[] menuItems;

    // maintains the current position of the interation over the array
    int position = 0;

    // takes the array of menu items we are going to iterate over.
    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;


    }

    /*
    return the next item in the array and increment the position
     */
    @Override
    public Object next() {
       MenuItem menuItem = menuItems[position];
       position++;
       return  menuItem;
    }

    /**
     * checks to see if we`ve seen all the elements of the array and returns true if there are more to iterate through
     * @return
     */
    @Override
    public boolean hasNext() {
        if (position >= menuItems.length || menuItems[position] == null ) {
            return false;
        } else {
            return  true;
        }
    }
}
