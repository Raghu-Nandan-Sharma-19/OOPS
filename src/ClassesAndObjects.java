class Student {
    private String name;
    private int rollNumber;

    public void setDetails(String _name, int _rollNumber) {
        this.name = _name;
        this.rollNumber = _rollNumber;
    }

    public void getDetails() {
        System.out.println("Name : " + this.name);
        System.out.println("Roll Number : " + this.rollNumber);
    }
}

public class ClassesAndObjects {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setDetails("Raj", 101);
        student1.getDetails();
    }
}
