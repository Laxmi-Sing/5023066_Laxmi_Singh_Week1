package Data_Structures_And_Algorithms.ECommercePlatformSearchFunction;

public class LinearSearch {
    public static Product linearSearch(Product[] products,String productId){
        for(Product product:products){
            if(product.getProductId().equals(productId)){
                return product;
            }
        }
        return null;
    }
}
