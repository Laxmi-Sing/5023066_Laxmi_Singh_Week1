package Data_Structures_And_Algorithms.SortingcustomerOrders;

public class QuickSort {
    public static void quickSort(Order[] orders){
        sort(orders,0,orders.length-1);
    }

    private static void sort(Order[] orders, int low, int high) {
        if(low>=high){
            return;
        }
        int s=low;
        int e=high;
        int m=s+(e-s)/2;
        double pivot=orders[m].getTotalPrice();
        while(s<=e){
            while(orders[s].getTotalPrice()<pivot){
                s++;
            }
            while(orders[e].getTotalPrice()>pivot){
                e--;
            }
            Order temp=orders[s];
            orders[s]=orders[e];
            orders[e]=temp;
            s++;
            e--;
        }
        sort(orders,low,e);
        sort(orders,s,high);
    }
}
