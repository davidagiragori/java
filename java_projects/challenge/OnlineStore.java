package challenge;

public class OnlineStore {

    public static void main(String[] args) {
        
        Product product01 = new Product ("Shirt", 20.00, 10);
        Product product02 = new Product ("Pant", 30.00, 5);
        Customer myCust01 = new Customer ("David",  2);

        myCust01.purchase (product01, 2);
        myCust01.purchase (product02, 2);

        myCust01.checkout ();

    }
    
}