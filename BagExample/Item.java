package BagExample;

public class Item {
    private String itemName;
    public int itemPrice;

    public Item(String name, int price) {
        this.itemName = name;
        this.itemPrice = price;
    }

    public int getPrice(){
        return itemPrice;
    }

    public String getName(){
        return itemName;
    }
}
