package Data_Structures_And_Algorithms.InventoryManagementSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter product id,name,quantity and price of product1");
        int id1=sc.nextInt();
        String name=sc.next();
        int quantity=sc.nextInt();
        double price=sc.nextDouble();
        Product product1=new Product(id1,name,quantity,price);
        Inventory inventory=new Inventory();
        inventory.add(product1);
        inventory.display();
        System.out.println("Enter product id,name,quantity and price of product2");
        int id=sc.nextInt();
        name=sc.next();
        quantity=sc.nextInt();
        price=sc.nextDouble();
        Product product2=new Product(id,name,quantity,price);
        inventory.add(product2);
        inventory.display();
        System.out.println("Updating product1 with the product2");
        inventory.update(id1,product2);
        inventory.display();
        System.out.println("Deleting product2");
        inventory.delete(id);
        inventory.display();
    }

}
