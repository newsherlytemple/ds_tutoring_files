package LinkedBagExample;

import ArrayBagExample.BagInterface; // use the same BagInterface from ArrayBagExample

public class LinkedBag<T> implements BagInterface<T>{

    private Node firstNode; // reference to first node
    private int numberOfEntries;

    public LinkedBag() {
        firstNode = null;
        numberOfEntries = 0;
    }
//  x   <- a     <- b
//  numentries = 2

    public int getCurrentSize() {
        return numberOfEntries;
    }

    public boolean isEmpty() {
        if (numberOfEntries == 0)
            return true;
        else
            return false;
    }

    public boolean add(T newEntry) {
        Node newNode = new Node(newEntry);
        newNode.next = firstNode; // Make new node reference rest of chain
        // (firstNode is null if chain is empty)
        firstNode = newNode; // New node is at beginning of chain
        numberOfEntries++;
        return true;
    }

    //  x   <- a     [<- b] <-killing this one
    public T remove() {
        T result = null;
        if (firstNode != null) {
            result = firstNode.data;
            System.out.println(firstNode);
            firstNode = firstNode.next; // Remove first node from chain
            numberOfEntries--;
        } // end if
        return result;
    }

    public boolean remove(T anEntry) {
        // this isnt working atm
        return false;
    }

    public void clear() {
        while (!isEmpty())
            remove();
    }

    public int getFrequencyOf(T anEntry) {
        int frequency = 0;
        int loopCounter = 0;
        Node currentNode = firstNode;
        while (loopCounter < numberOfEntries && currentNode != null) {
            if (anEntry.equals(currentNode.data)) {
                frequency++;
            } // end if
            loopCounter++;
            currentNode = currentNode.next;
        } // end while
        return frequency;
    }

    public boolean contains(T anEntry) {
        boolean found = false;
        Node currentNode = firstNode;
        while (!found && currentNode != null) {
            if (anEntry.equals(currentNode.data)) {
                found = true;
            } else {
            currentNode = currentNode.next;
            }
        } // end while
        return found;
    }

    public T[] toArray() {
        // The cast is safe because the new array contains null entries
        @SuppressWarnings("unchecked")
        T[] result = (T[])new Object[numberOfEntries]; // Unchecked cast
        int index = 0;
        Node currentNode = firstNode;
        while ((index < numberOfEntries) && (currentNode != null)) {
            result[index] = currentNode.data;
            index++;
            currentNode = currentNode.next;
        } // end while
        return result;
    }

    private Node getReferenceTo(T anEntry) {
        boolean found = false;
        Node currentNode = firstNode;
        while (!found && currentNode != null) {
            if (anEntry.equals(currentNode.data)) {
                found = true;
            } else {
                currentNode = currentNode.next;
            }
        } // end while
        return currentNode;
    } // end getReferenceTo

    private class Node {
        private T data; // data in bag
        private Node next; // address of next node

        // constructor to make a node without a next node
        private Node (T dataPortion) {
            this(dataPortion, null);
        } 

        // constructor to make a new node with address of next node
        private Node (T dataPortion, Node nextNode) {
            data = dataPortion;
            next = nextNode;
        }
    } // end Node

    

}
