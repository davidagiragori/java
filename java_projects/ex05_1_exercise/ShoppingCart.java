package ex05_1_exercise;

public class ShoppingCart {

    public static void main(String[] args) {
        String custName = "Mary Smith";
        String itemDesc = "Shirt";

        // numeric fields
        double price = 21.99;
        int availableQuantity = 2;
        int orderedQuantity = 2;
        double tax = 1.04;
        double total;
        String message = custName + " wants to purchase " + orderedQuantity + " " + itemDesc;  ;

        // Calculating total cost
        total = (price * orderedQuantity) * tax;

        // Declare outOfStock variable and initialize it
        boolean outOfStock = (availableQuantity < orderedQuantity);

        // Test quantity and modify message if quantity > 1.
        if (orderedQuantity > 1) {
            message = custName + " wants to purchase " + orderedQuantity + " " + itemDesc + "s";
        }

        System.out.println(message); 

        // Test outOfStock and notify user in either case.
        if (outOfStock) {
            System.out.println(itemDesc + " is out of stock");
        }
        else {
            System.out.printf("Total cost with tax is: %.2f.\n", total);            
        }
    }
}