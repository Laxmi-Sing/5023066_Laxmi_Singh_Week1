package Data_Structures_And_Algorithms.EmployeeManagementSystem;

public class EmployeeRecordManagement {
    private Employee[] employees;
    private int i;

    public EmployeeRecordManagement(int capacity) {
        this.employees = new Employee[capacity];
        i=0;
    }
    public void add(Employee employee) {
        if (i < employees.length) {
            employees[i] = employee;
            i++;
        } else {
            System.out.println("Cannot add more employees Sorry");
        }
    }
    public Employee search(int empId){
        for(int j=0;j<i;j++){
            if(employees[j].getEmployeeId()==empId){
                return employees[j];
            }
        }
        return null;
    }
    public void traverse(){
        for(int j=0;j<i;j++){
            if(employees[j]!=null)
                System.out.println(employees[j]);
        }
    }
    public void delete(int empId){
        for(int j=0;j<i;j++){
            if(employees[j].getEmployeeId()==empId){
                for(int k=j;k<i;k++){
                    employees[k]=employees[k+1];
                }
                employees[i-1]=null;
                return;
            }

        }
    }
}
