package Data_Structures_And_Algorithms.SortingcustomerOrders;

public class Main {
    public static void main(String[] args) {
        Order[] orders={
                new Order(1,"Aryan",500),
                new Order(2,"Prerna",800),
                new Order(3,"Aman",150),
                new Order(4,"Laxmi",580)
        };
        BubbleSort.bubbleSort(orders);
        System.out.println("Bubble Sort");
        for(Order order:orders){
            System.out.println(order);
        }
        Order[] orders1={
                new Order(1,"Aryan",500),
                new Order(2,"Prerna",800),
                new Order(3,"Aman",150),
                new Order(4,"Laxmi",580)
        };
        System.out.println("Quick Sort");
        QuickSort.quickSort(orders1);
        for(Order order:orders){
            System.out.println(order);
        }
    }
}
