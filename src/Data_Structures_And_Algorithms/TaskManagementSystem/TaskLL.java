package Data_Structures_And_Algorithms.TaskManagementSystem;

public class TaskLL {
    public static class Node{
        Task task;
        Node next;
        Node(Task task){
            this.task=task;
            this.next=null;
        }
    }
    private Node head;
    public void insert(Task task){
        Node node=new Node(task);
        if(head==null){
            head=node;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;

    }
    public Task search(String taskName){
        if(head==null){
            return null;
        }
        Node temp=head;
        while(temp!=null){
            if(temp.task.name.equalsIgnoreCase(taskName)){
                return temp.task;
            }
        }
        return null;
    }
    public void delete(String taskName){
        if(head==null){
            return;
        }
        Node temp=head;
        while(temp!=null){
            if(temp.task.name.equals(taskName)){
                if(temp.next==null){
                    return;
                }
                temp.next=temp.next.next;

            }
            temp=temp.next;
        }

    }
    public void traverse(){
        Node temp=head;
        if(head.next==null){
            System.out.println(temp.task);
            return;
        }
        while(temp!=null){
            System.out.print(temp.task);
            temp=temp.next;
        }
        System.out.print("X");
        System.out.println();
    }

}
