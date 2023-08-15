package ex05_3_exercise;

public class ShoppingCart {

    public static void main(String[] args) {
        // local variables
        String custName = "Mary Smith";
        String message;
        double price = 21.99;
        int quantity = 2;
        double tax = 1.04;
        int i=1;
        String items[];
        items = new String[4];
        items[0] = "Shirt";
        items[1] = "Belt";
        items[2] = "Scarf";
        items[3] = "Skirt";

        message = custName + " wants to purchase " + items.length + " items.";
        System.out.println(message);

       // Iterate through and print out the items from the items array
       for (String item:items) {
        System.out.println("Item " + i + " Name is " + item);
        i++;
        }

       for (int j=0; j < items.length; j++) {
        System.out.println("Item " + (j+1) + " Name is " + items[j]);
        }
    }
}