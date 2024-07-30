package Data_Structures_And_Algorithms.ECommercePlatformSearchFunction;

public class Product {
    private String productId;
    private String productName;
    private String category;
    public Product(String productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }
    public String getProductId(){
        return this.productId;
    }
    public String getProductName(){
        return this.productName;
    }

    public String getCategory() {
        return this.category;
    }


    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
