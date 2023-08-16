package ex07_3_exercise;

public class ShoppingCart {
    public static void main(String[] args) {
        int int1;
        
	    //  Declare and initialize variables of type long, float, and char.
        
        long long1 = 9999999999L;
        // float float1 = 999.99F;
        // char char1 = 'Y';
        
        // Print the long variable.

        System.out.println ("Long " + long1);

	    // Assign the long to the int and print the int variable.
        
        int1 = (int) long1;
        System.out.println ("Int " + int1);

    }
}