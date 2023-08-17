package challenge;

public class Product {

    private String productName;
    private double price;
    private int stockQuantity;

    // Constructor
    public Product(String productName, double price, int stockQuantity) {

        this.productName = productName;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    // Getters and Setters
    public String getProductName() {
        return this.productName;
    }

    public double getPrice() {
        return this.price;
    }

    public int getStockQuantity() {
        return this.stockQuantity;
    }    

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(double price) {
        this.price = price;
    }    

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = this.stockQuantity - stockQuantity;
    }
   
    public void restock(int quantity) {
        if (quantity > 0) {
            this.stockQuantity += quantity;
        }

    }
}