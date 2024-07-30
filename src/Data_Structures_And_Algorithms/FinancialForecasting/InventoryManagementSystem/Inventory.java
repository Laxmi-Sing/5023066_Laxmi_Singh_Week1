package Data_Structures_And_Algorithms.FinancialForecasting.InventoryManagementSystem;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    public Map<Integer,Product> products;
    public Inventory(){
        products=new HashMap<>();
    }
    public void add(Product product){
        products.put(product.productId,product);
    }
    public void update(Integer productId,Product newProduct){
        products.put(productId,newProduct);
    }
    public void delete(Integer productId){
        products.remove(productId);
    }
    public void display(){
        for(Product product: products.values()){
            System.out.println("ID: "+product.productId+" Name: "+product.productName+" Quantity: "+product.quantity+" Price: "+product.price);
        }
    }
}
