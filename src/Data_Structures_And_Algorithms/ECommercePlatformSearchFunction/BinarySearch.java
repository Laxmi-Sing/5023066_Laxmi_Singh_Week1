package Data_Structures_And_Algorithms.ECommercePlatformSearchFunction;

public class BinarySearch {
    public static Product binarySearch(Product[] products,String productId){
        int start=0;
        int end= products.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            int cmp=products[mid].getProductId().compareTo(productId);
            if(cmp==0){
                return products[mid];
            }
            else if(cmp<0){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return null;

    }
}
