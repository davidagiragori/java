package ex05_2_exercise;

public class ShoppingCart {

    public static void main(String[] args) {
        // local variables
        String custName = "Mary Smith";
        String message = custName + " wants to purchase several items.";

        // TODO: Declare and initialize the items String array
        String[] items = {"Shirt", "Trouser", "Tee", "Jean"};
        
        // TODO: Change message to show the number of items the customer wants to purchase

        message = custName + " wants to purchase " + items.length + " items.";
        System.out.println(message);

        // TODO: Print an element from the items array
        
        System.out.println("Item Name is " + items[0]);
        System.out.println("Item Name is " + items[1]);
        System.out.println("Item Name is " + items[2]);
        System.out.println("Item Name is " + items[3]);

    }

}