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
        BagInterface<Item> shoppingCart = new ArrayListBag<>();
        int totalCost = 0;

        for (int index = 0; index < items.length; index++){
            Item nextItem = items[index]; 
            shoppingCart.add(nextItem);
            totalCost = totalCost + nextItem.getPrice();
        }

        while (!shoppingCart.isEmpty()){
            System.out.println(shoppingCart.remove());
        }
        
        System.out.println("Total cost: " + "\t$" + totalCost / 100 + "." + totalCost % 100);
        
    } 
} 