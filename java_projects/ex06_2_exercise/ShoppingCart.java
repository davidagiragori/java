package ex06_2_exercise;

public class ShoppingCart {

     public static void main(String[] args) {
      
        // Declare and initialize 2 Item objects

        Item item01 = new Item(1, "Shirt", 10.00, 1);
        Item item02 = new Item(1, "Belt", 10.00, 2);

        // item01.desc = "Shirt";
        // item02.desc = "Belt";
        
        // Print both item descriptions and run code.

        // System.out.println ("Item1 " + item01.desc);
        // System.out.println ("Item2 " + item02.desc);

        item01.displayItemDetails();
        item02.displayItemDetails();

        // Assign one item to another and run it again.

        item02 = item01;

        // System.out.println ("Item1 " + item01.desc);
        // System.out.println ("Item2 " + item02.desc);

        item01.displayItemDetails();
        item02.displayItemDetails();

     }
} 