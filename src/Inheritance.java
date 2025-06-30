import java.util.Scanner;

class Employee1 {
    protected String name;
    protected int id;

    Employee1(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayDetails() {
        System.out.println("Name : " + this.name);
        System.out.println("Id : " + this.id);
    }
}

class Manager extends Employee1 {
    private int teamSize;

    Manager(String name, int id, int teamSize) {
        super(name, id);
        this.teamSize = teamSize;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size : " + this.teamSize);
    }
}

class Engineer extends Employee1 {
    private String specialization;

    Engineer(String name, int id, String specialization) {
        super(name, id);
        this.specialization = specialization;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Specialization : " + this.specialization);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter manager name : ");
        String managerName = scanner.nextLine();

        System.out.print("Enter manager Id : ");
        int managerId = scanner.nextInt();

        System.out.print("Enter manager team size : ");
        int managerTeamSize = scanner.nextInt();
        System.out.println();

        System.out.print("Enter employee name : ");
        String employeeName = scanner.nextLine();
        scanner.nextLine();

        System.out.print("Enter employee Id : ");
        int employeeId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter employee Specialization : ");
        String employeeSpecialization = scanner.nextLine(); 
        System.out.println();

        System.out.println("Employee Details : ");
        System.out.println();

        // Create Manager instance
        Manager manager = new Manager(managerName, managerId, managerTeamSize);
        System.out.println("Manager Details");
        manager.displayDetails();

        // Create Engineer instance
        Engineer engineer = new Engineer(employeeName, employeeId, employeeSpecialization);
        System.out.println("\nEngineer Details");
        engineer.displayDetails();

        scanner.close();
    }
}
