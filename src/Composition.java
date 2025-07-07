import java.util.List;
import java.util.ArrayList;

class College {
    String name;
    String id;

    College(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public void displayDetails() {
        System.out.println("College Name : " + this.name);
        System.out.println("College ID : " + this.id);
    }
}

class University {
    private List<College> colleges;
    private String name;

    University(String name) {
        this.colleges = new ArrayList<>();
        this.name = name;
    }

    public void addCollege(String collegeName, String collegeId) {
        colleges.add(new College(collegeName, collegeId));
    } 

    public void displayDetails() {
        System.out.println("University Name : " + this.name);
        for (College college : colleges) {
            college.displayDetails();
        }
    }
}

public class Composition {
    public static void main(String[] args) {
        String universityName = "Global_University";
        String[] collegeNames = { "COEP", "PICT", "VJTI", "WCE", "PCCOE" };
        String[] collegeIds = { "CO8543", "PI9514", "VJ8643", "VF569", "PC9246" };

        // Create University object
        University university = new University(universityName);

        // Add colleges to the university
        for (int i = 0; i < collegeNames.length; i++) {
            university.addCollege(collegeNames[i], collegeIds[i]);
        }

        // Display details
        university.displayDetails();
    }
}
