package _10Iterator.objectville_iteratorFromScratch.iterator;

import _10Iterator.objectville_iteratorFromScratch.menu.MenuItem;

import java.util.ArrayList;

public class PancakeHouseIterator implements Iterator {

    ArrayList<MenuItem> pancakeItems;

    // maintains the current position of the interation over the array
    int position = 0;

    public PancakeHouseIterator(ArrayList<MenuItem> pancakeItems) {
        this.pancakeItems = pancakeItems;
    }


    @Override
    public boolean hasNext() {
        return  (position < pancakeItems.size());
    }

    @Override
    public Object next() {
        MenuItem menuItem = pancakeItems.get(position);
        position++;
        return  menuItem;
    }
}
