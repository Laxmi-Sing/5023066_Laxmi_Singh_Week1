package Data_Structures_And_Algorithms.TaskManagementSystem;

public class Main {
    public static void main(String[] args) {
        Task task1=new Task(1,"Yoga","Completed");
        Task task2=new Task(2,"Lunch","Completed");
        Task task3=new Task(3,"Assignment upload","pending");
        TaskLL list=new TaskLL();
        list.insert(task1);
        list.insert(task2);
        list.insert(task3);
        list.traverse();
        System.out.println(list.search("yoga"));;
        list.delete("Lunch");
        System.out.println();
        list.traverse();

    }
}
