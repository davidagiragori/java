package ex09_2_exercise;

public class ShoppingCart {

    public static void main(String args[]) {

        // Declare, instantiate, and initialize a Customer object
        Customer customer01 = new Customer ("David G", "11111111111");

        // Print the customer object name
        System.out.println ("Name: " + customer01.getName());
        System.out.println ("SSN: " + customer01.getSSN());

        // Print the customer object name
        customer01.setName ("David Giragori");
        System.out.println ("Name: " + customer01.getName());
        System.out.println ("SSN: " + customer01.getSSN());

    }
}