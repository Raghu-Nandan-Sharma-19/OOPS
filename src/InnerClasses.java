import java.util.Scanner;

class Robot {
    private String name;

    Robot(String name) {
        this.name = name;
    }

    public void performAction() {
        System.out.println(name + " is performing an action.");
    }

    class Arm {
        public void pickItem() {
            System.out.println(name + " arm picking an item.");
        }
    }

    static class Processor {
        public void process() {
            System.out.println("Processor analyzing the data.");
        }
    }

    public void manageSensors() {
        class Sensor {
            public void sense() {
                System.out.println(name + " sensor detecting obstacles.");
            }
        }

        Sensor sensor = new Sensor();
        sensor.sense();
    }

    interface Task {
        void execute();
    }

    public void executeTask() {
        Task task = new Task() {
            @Override
            public void execute() {
                System.out.println(name + " executing a custom task.");
            }
        };

        task.execute();
    }
}

public class InnerClasses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter name of Robot : ");
        String name = scanner.nextLine();
        
        System.out.println();
        //Creating the object of the class Robot
        Robot robot = new Robot(name);
        
        //Calling the performAction method of class Robot
        robot.performAction();
        
        //Using non static inner class
        //creating the object of the inner class and calling the its method pickItem
        Robot.Arm arm = robot.new Arm();
        arm.pickItem();
        
        //Using static nested class
        //creating the object of the nested class and calling the its method process
        Robot.Processor processor = new Robot.Processor();
        processor.process();
        
        //Calling the method manageSensors that implements the local inner class
        //It then calls the sense method inside the manageSensors method to print the coorresponding text
        robot.manageSensors();
        
        //Calling method executeTask that Override the method execute which is implemented in by the interface Task
        robot.executeTask();

        scanner.close();
    }
}
