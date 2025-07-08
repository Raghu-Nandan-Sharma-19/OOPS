class Department {
    private String name;
    private String id;

    public Department(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public void displayDetails() {
        System.out.println("Department Name : " + this.name);
        System.out.println("Department Id : " + this.id);
    }
}

class Employee {
    private String name;
    private int id;
    private Department department;

    public Employee(String name, int id, Department department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    public void displayDetails() {
        System.out.println("Employee Name : " + this.name);
        System.out.println("Employee Id : " + this.id);

        if (this.department != null) {
            department.displayDetails();
        }
    }
}

public class LearnAggregation {
    public static void main(String[] args) {
        System.out.print("Enter Employee Name : ");
        String employeeName = "Raj";
        
        System.out.print("Enter Employee Id : ");
        int employeeId = 79;

        System.out.print("Enter Department Name : ");
        String departmentName = "Software Development";
        
        System.out.print("Enter Department Id : ");
        String  departmentId = "SDE7890";

        System.out.println();
        
        //creats a object of Department class with departmentName, departmentId as the arguments
        Department department = new Department(departmentName, departmentId);
        
        //creates a object of Employee class with employeeName, employeeId, department as the arguments
        Employee employee = new Employee(employeeName, employeeId, department);
        
        //calls the display method using the employee object
        employee.displayDetails();
    }
}
