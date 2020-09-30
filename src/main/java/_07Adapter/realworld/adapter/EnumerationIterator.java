package _07Adapter.realworld.adapter;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * implement an adapter that adapts an Enumeration to an Iterator;
 * Iterator(target)
 * Enum (adaptee)
 *
 */

public class EnumerationIterator implements Iterator<Object> {

    Enumeration<?> enumeration;

    public EnumerationIterator(Enumeration<?> enumeration) {
        this.enumeration =  enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Object cannot be removed");
    }

}
