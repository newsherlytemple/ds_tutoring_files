package BagExample;

import java.util.ArrayList;

// actual bag object
public class ArrayListBag<T> implements BagInterface<T> {
    // attributes
    private ArrayList<T> bag; // [stuff, stuff, stuff, stuff]
    
    //methods

    // constructor
    public ArrayListBag() {
        bag = new ArrayList<>(); // empty array list
    }
    
    public int getCurrentSize() {
        return bag.size(); // returns length of bag
    }
    
    public boolean isEmpty() {
        return bag.isEmpty(); // return True if bag is empty
    }
    
    public boolean add(T newEntry) {
        return bag.add(newEntry); // return True if newEntry is added to bag
    }
    
    // to remove last item
    public T remove() {
        if (!bag.isEmpty()) { // if not empty
            return bag.remove(bag.size() - 1); //["1", "2", "3", "4"].size() = 4
                                               //[  0,   1,   2,   3]
                                               // reindexing 
        }
        return null; // if empty return null
    }
    
    // to remove specific item
    public boolean remove(T anEntry) {
        return bag.remove(anEntry); // return True if anEntry is removed from bag
    }
    
    // remove all items
    public void clear() {
        bag.clear();
    }
    
    // how many of an item are in the bag
    public int getFrequencyOf(T anEntry) { 
        // ex. ("john", 18) - of type Item (falls under T)
        // say our bag is [5, 18.653, True, ("john", 18), "john", 18, ("jane", 20)]
        int count = 0;
        for (T item : bag) { // iterator
            if (item.equals(anEntry)) { // if item is equal to anEntry 
                count++; // increase count by 1
            }
        }
        return count;
    }
    
    // check if an item is in the bag
    public boolean contains(T anEntry) {
        return bag.contains(anEntry);
    }
    
    // returns all items in the bag as an arrayList
    public T[] toArray() {
        return (T[]) bag.toArray(new Object[0]);
    }
    
}