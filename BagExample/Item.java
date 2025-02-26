package BagExample;

public class Item {
    private String itemName;
    public int itemPrice;

    // constructor
    public Item(String name, int price) {
        itemName = name;
        itemPrice = price;
    }

    // returns price
    public int getPrice(){
        return itemPrice;
    }

    // returns name
    public String getName(){
        return itemName;
    }
}
