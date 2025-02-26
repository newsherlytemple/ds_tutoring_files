package BagExample;

// map of the bag object
public interface BagInterface<T> {

    // a bag is a abstract data type 
    // way to think about this: its some data structure that we can implement!
    // there's not one standard way to implement, so Java doesn't have a built-in bag class
   
    // methods for our bag, from your notes (ch01)
    public int getCurrentSize();
    public boolean isEmpty();
    public boolean add(T newEntry);
    public T remove();
    public boolean remove(T anEntry);
    public void clear();
    public int getFrequencyOf(T anEntry);
    public boolean contains(T anEntry);
    public T[] toArray();

} 

    // a bag is some collection. any collection
    // has items in no particular order
    // can have duplicates
    // can have any number of items
    // can be empty
    // can add and remove items as we go thru the bag w/ an iterator
    // don't need to know indices b/c there's no inherent order
