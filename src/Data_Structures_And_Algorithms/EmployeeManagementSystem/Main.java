package Data_Structures_And_Algorithms.EmployeeManagementSystem;

public class Main {
    public static void main(String[] args) {
        Employee emp1=new Employee(101,"Ramesh","developer",50000);
        Employee emp2=new Employee(102,"Manish","Manager",100000);
        Employee emp3=new Employee(103,"Priya","HR",45000);
        EmployeeRecordManagement employeeRecordManagement=new EmployeeRecordManagement(10);
        employeeRecordManagement.add(emp1);
        employeeRecordManagement.add(emp2);
        employeeRecordManagement.add(emp3);
        employeeRecordManagement.traverse();
        System.out.println();
        employeeRecordManagement.search(102);
        employeeRecordManagement.delete(103);
        employeeRecordManagement.traverse();
    }
}
