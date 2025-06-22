import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Book {
    private List<String> title = new ArrayList<>();
    private List<String> author = new ArrayList<>();
    private List<Boolean> isAvailable = new ArrayList<>();

    public Book(List<String> title, List<String> author, List<Boolean> isAvailable) {
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    public void borrowBook(String bookName) {
        for (int i = 0; i < this.title.size(); i++) {
            if (this.title.get(i).equals(bookName)) {
                if (this.isAvailable.get(i)) {
                    this.isAvailable.set(i, false);
                    return;
                } else {
                    System.out.println("Book is not available.");
                }
            }

            System.out.println("Book is not Available");
        }
    }

    public void returnBook(String bookName) {
        for (int i = 0; i < this.title.size(); i++) {
            if (this.title.get(i).equals(bookName)) {
                if (!this.isAvailable.get(i)) {
                    this.isAvailable.set(i, true);
                    return;
                }
            }
        }
    }

    public void getAvailability(String bookName) {
        for (int i = 0; i < this.title.size(); i++) {
            if (this.title.get(i).equals(bookName)) {
                if (this.isAvailable.get(i)) {
                    System.out.println("true");
                    return;
                }
            }
        }

        System.out.println("false");
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        List<String> title = Arrays.asList(
            "Sherlock_Holmes",
            "Frankenstein",
            "King_Arthur_and_the_Round_Table",
            "Treasure_Island"
        );

        List<String> author = Arrays.asList(
            "Arthur_Conan_Doyle",
            "Mary_Shelley",
            "Roger_Lancelyn_Green",
            "Robert_Louis_Stevenson"
        );

        List<Boolean> isAvailable = Arrays.asList(
            false,
            true,
            false,
            false
        );

        Book book = new Book(title, author, new ArrayList<>(isAvailable));

        // methodCalls
        book.borrowBook("Frankenstein");                       // Valid borrow
        book.borrowBook("Sherlock_Holmes");                    // Not available
        book.returnBook("King_Arthur_and_the_Round_Table");    // Return
        book.getAvailability("Sherlock_Holmes");               // Should be false
        book.borrowBook("Frankenstein");                       // Already borrowed
    }
}