package Data_Structures_And_Algorithms.ECommercePlatformSearchFunction;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Product[] products={
                new Product("101", "Maggi Pasta", "Food")
                ,new Product("102", "Maggi Noodles", "Food")
                ,new Product("105", "Nescafe Gold", "Beverages")
                ,new Product("104", "Munch Maha", "Chocolate")
                ,new Product("103", "Cerelac Stage 5", "Nutrition")
        };
        Product result=LinearSearch.linearSearch(products,"103");
        if(result!=null){
            System.out.println("By linear search Product "+result.getProductName() +" found having id "+result.getProductId()+" and category "+result.getCategory() );
        }
        Arrays.sort(products,(p,q)->p.getProductId().compareTo(q.getProductId()));
        result=BinarySearch.binarySearch(products,"104");
        if(result!=null){
            System.out.println("By binary search search Product "+result.getProductName() +" found having id "+result.getProductId()+" and category "+result.getCategory() );
        }

    }
}
