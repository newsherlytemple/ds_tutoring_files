package BagExample;

import java.util.ArrayList;

public class ArrayListBag<T> implements BagInterface<T> {
    private ArrayList<T> bag;
    
    public ArrayListBag() {
        bag = new ArrayList<>();
    }
    
    public int getCurrentSize() {
        return bag.size();
    }
    
    public boolean isEmpty() {
        return bag.isEmpty();
    }
    
    public boolean add(T newEntry) {
        return bag.add(newEntry);
    }
    
    public T remove() {
        if (!bag.isEmpty()) {
            return bag.remove(bag.size() - 1);
        }
        return null;
    }
    
    public boolean remove(T anEntry) {
        return bag.remove(anEntry);
    }
    
    public void clear() {
        bag.clear();
    }
    
    public int getFrequencyOf(T anEntry) {
        int count = 0;
        for (T item : bag) {
            if (item.equals(anEntry)) {
                count++;
            }
        }
        return count;
    }
    
    public boolean contains(T anEntry) {
        return bag.contains(anEntry);
    }
    
    public T[] toArray() {
        return (T[]) bag.toArray(new Object[0]);
    }
    
}