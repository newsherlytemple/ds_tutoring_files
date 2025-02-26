package BagExample;

public class OnlineShopper
{
    public static void main(String[] args) {

        Item[] items = {new Item("Bird feeder", 2050),
                        new Item("Squirrel guard", 1547),
                        new Item("Bird bath", 4499),
                        new Item("Sunflower seeds", 1295)};

        // NOTE: you can have different values for the item type and the constructor type
        // but only if it's an interface that is implemented by a class
        // class to class (same class)
        // interface to class (class that implements the interface)
        BagInterface<Item> shoppingCart = new ArrayListBag<>();


        int totalCost = 0; // initalize total cost to 0
        for (int index = 0; index < items.length; index++){ // for each item in Items[]
            Item nextItem = items[index]; // get one item at a time
            shoppingCart.add(nextItem); // adding item to our bag (shoppingCart)
            totalCost = totalCost + nextItem.getPrice(); // increasing total price
        }

        while (!shoppingCart.isEmpty()){ // while not empty
            System.out.println(shoppingCart.remove());
        }
        
        System.out.println("Total cost: " + "\t$" + totalCost / 100 + "." + totalCost % 100);
        
    } 
} 