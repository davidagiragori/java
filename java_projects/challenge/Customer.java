package challenge;

import java.util.*;

public class Customer {

    private String name;
    private int quantityToPurchase;
    private List<Product> cart = new ArrayList<Product>();
    //private List<PurchaseHistory> purchaseHistory;

    // Constructor
    public Customer(String name, int quantity) {

        this.name = name;
        this.quantityToPurchase = quantity;
        //this.purchaseHistory = purchaseHistory;
    }

    public void purchase (Product product, int quantity) {

        this.quantityToPurchase = quantity;
        
        if (product.getStockQuantity() <= 0) {
            System.out.println(product.getProductName() + " is out of stock");
        } else if (quantityToPurchase > product.getStockQuantity()) {
            System.out.printf("only %d available in stock", product.getStockQuantity());
        } else {
            product.setStockQuantity (quantityToPurchase);
            System.out.printf("%d quantity of %s added to the cart ", quantityToPurchase, product.getProductName());
            this.addToCart(product);
        }

        System.out.println();        

    }


    private void addToCart(Product product) {

        if (product != null) {
            this.cart.add(product);
        } else {
            System.out.println("Select a product to add to Cart");
        }

    }

    public void checkout() {

       StringBuilder sb = new StringBuilder();
       double cost = 0.0;

       System.out.println();
       System.out.println("Order Details for " + name);
       System.out.println("Total Items in the cart " + cart.size());

       // Calculate total price of the purchase
       for (Product product: cart) {
          cost += product.getPrice() * quantityToPurchase;
          String detail = quantityToPurchase + " " +  product.getProductName() + " added to cart with price of each at " + product.getPrice() + "\n";
          //String remainStock  = "Remaining quantity for " + product.getProductName() + " " + product.getStockQuantity() + "\n";
          sb.append(detail);
          //sb.append(remainStock); 
        }

        System.out.println(sb);
        System.out.println("Order Total " + cost);
    }

}