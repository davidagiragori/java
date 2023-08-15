package ex07_2_exercise;

public class ShoppingCart {
    
    public static void main (String[] args) {

        String custName = "Steve Smith";
        String firstName;
        int spaceIdx;
        StringBuilder sb;
       
        spaceIdx = custName.indexOf(" ");
        firstName = custName.substring(0, spaceIdx);
        System.out.println("First Name " +firstName);
          
	    //Instantiate and initialize sb to firstName.

        sb = new StringBuilder (firstName);

	    // Put the full name back together, using StringBuilder append method.
	    //   You can just enter the String literal for the last name.
	    //   Print the full name.               

        // sb.append (" Smith");

        sb.append (custName.substring(spaceIdx, custName.length()));
        System.out.println("Full Name: " + sb);

    }
}
