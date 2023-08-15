package ex06_2_exercise;

public class Item {

    // Fields (Properties)

    public int itemID;
    public String desc;
    public double price;
    public int quantity;

    // Constructor 

    public Item (int itemID, String desc, double price, int quantity) {
        
        this.itemID = itemID;
        this.desc = desc;
        this.price = price;
        this.quantity = quantity;

    }

    // Method (Behavior)

    public void displayItemDetails () {
        System.out.println ("Item desc " + desc + ", Quantity " + quantity + ", Price " + (quantity * price));
    }
}