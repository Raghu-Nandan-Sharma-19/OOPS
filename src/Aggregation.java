import java.util.Scanner;

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

public class Aggregation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name : ");
        String employeeName = sc.nextLine();
        
        System.out.print("Enter Employee Id : ");
        int employeeId = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Department Name : ");
        String departmentName = sc.nextLine();
        
        System.out.print("Enter Department Id : ");
        String  departmentId = sc.nextLine();

        System.out.println();
        
        //creats a object of Department class with departmentName, departmentId as the arguments
        Department department = new Department(departmentName, departmentId);
        
        //creates a object of Employee class with employeeName, employeeId, department as the arguments
        Employee employee = new Employee(employeeName, employeeId, department);
        
        //calls the display method using the employee object
        employee.displayDetails();

        sc.close();
    }
}
