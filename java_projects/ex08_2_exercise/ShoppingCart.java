package ex08_2_exercise;

public class ShoppingCart {

    public static void main (String [] args) {

        Item myItem = new Item();

        // Call the 3-arg setItemFields method and then call displayItem.

        myItem.setItemFields ("Shirt", 1, 10.00);
        myItem.displayItem ();
        
        // Call the 4-arg setItemFields method, checking the return value.  

        // Test your code for both valid and invalid values
        
        int validItem = myItem.setItemFields ("Belt", 1, 15.00, 'Y'); 
        if (validItem < 0) {
            System.out.println ("Color is invalid");
        }
        else {
            myItem.displayItem();
        }    

    }
    
}
