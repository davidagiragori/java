package ex06_1_exercise;

public class Item {

    // Fields (Properties)

    public int id;
    public String descr;
    public double price;     
    public int quantity;

    // Constructor
    
    public Item (int id, String descr, double price, int quantity) {

        this.id = id;
        this.descr = descr;
        this.price = price;
        this.quantity = quantity;        

    }

    // Method (Behavior)

    public void totalPrice () {

        double total = (price * quantity);
        System.out.println ("Total price of the item (Pre Tax): " + total);

    }
}
