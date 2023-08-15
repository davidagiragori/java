package ex06_1_exercise;

public class ShoppingCart {

    public static void main(String[] args) {
        
        // local variables
        // String custName = "Mary Smith";
        // String message;
        int i = 1;

        // double price = 21.99;
        // int quantity = 2;
        // double tax = 1.04;
       
        String items[];
        items = new String[4];
        items[0] = "Shirt";
        items[1] = "Belt";
        items[2] = "Scarf";
        items[3] = "Skirt";
        
        for (String item : items ) {

            // No comma for the last item

            if (i == items.length) {
                System.out.println(item);
            }
            else {
                System.out.print(item + ", ");
            }
            
            i++;
        }

        // Object Instance
     
        Item item01 = new Item(1, "Shirt", 10.00, 2);
        
        item01.totalPrice();

        // item01.id = 2;
        // item01.descr = "Belt";
        // item01.quantity = 1;
        // item01.price = 15.00;
        // item01.totalPrice();

    }    
}