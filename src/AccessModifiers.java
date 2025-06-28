import java.util.Scanner;

class Employee {
    public String name;
    protected int employeeId;
    private double salary;

    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;

        if (salary >= 0.0) {
            this.salary = salary;
        } else {
            this.salary = 0.0;
            System.out.println("Invalid salary");
        }
    }

    public void setSalary(double salary) {
        if (salary < 0.0) {
            System.out.println("Invalid salary");
            this.salary = 0.0;
            return;
        } 

        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }

    public void displayEmployeeDetails() {
        System.out.println("Name : " + this.name);
        System.out.println("Employee Id : " + this.employeeId);
        System.out.printf("Salary : %.2f\n", this.salary);
    }
}

public class AccessModifiers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter employee name : ");
        String name = scanner.nextLine();

        System.out.print("Enter employee Id : ");
        int employeeId = scanner.nextInt();
        
        System.out.print("Enter employee salary : ");
        double salary = scanner.nextDouble();

        System.out.print("Enter new salary of employee : ");
        double newSalary = scanner.nextDouble();
        System.out.println();
        
        Employee employee = new Employee(name, employeeId, salary);

        // Get and print the salary
        System.out.printf("Salary : %.2f\n", employee.getSalary());

        // Update the salary
        employee.setSalary(newSalary);

        // Display employee details
        employee.displayEmployeeDetails();

        scanner.close();
    }
}
