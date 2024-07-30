package Data_Structures_And_Algorithms.TaskManagementSystem;

public class Task {
    private int taskId;
    protected String name;
    private String status;

    public Task(int taskId, String name, String status) {
        this.taskId = taskId;
        this.name = name;
        this.status = status;
    }
    @Override
    public String toString(){
        return "task ID: "+taskId+" task name: "+name+" category: "+status+" -->";
    }

}
