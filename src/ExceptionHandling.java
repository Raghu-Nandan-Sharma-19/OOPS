import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Main class
class ExceptionHandling {
    public static void main(String[] args) {
        try {
            // Trying to read a file that does not exist
            File file = new File("nonexistent.txt");
            
            Scanner reader = new Scanner(file); // FileNotFoundException may occur
        } 
        catch (FileNotFoundException e) {
            System.out.println("Error: File not found!");
        }
        
        System.out.println("Program continues...");
    }
}

