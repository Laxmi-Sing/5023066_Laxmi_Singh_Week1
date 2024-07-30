package Data_Structures_And_Algorithms.InventoryManagementSystem;

public class Product {
    protected int productId;
    protected String productName;
    protected int quantity;
    protected double price;
    public Product(int productId,String productName,int quantity,double price){
        this.productId=productId;
        this.productName=productName;
        this.quantity=quantity;
        this.price=price;
    }
}
