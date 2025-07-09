import java.util.*;

class Book1 {
    String title;
    String author;

    Book1(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

class Library1 {
    String name;
    List<Book1> books;

    Library1(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    void addBook(Book1 book) {
        books.add(book);
    }

    Library1 shallowClone() {
        Library1 newLibrary = new Library1(this.name);
        newLibrary.books = this.books;
        return newLibrary;
    }

    Library1 deepClone() {
        Library1 newLibrary = new Library1(this.name);
        for (Book1 book : books) {
            newLibrary.addBook(new Book1(book.title, book.author)); // Creates new copies of books
        }
        return newLibrary;
    }

    void display() {
        System.out.println("Library : " + name);
        for (Book1 book : books) {
            System.out.println("Book : " + book.title + ", Author : " + book.author);
        }
    }
}

public class ObjectCloning {
    public static void main(String[] args) {
        // Hardcoded input
        String libraryName = "Central_Library";
        String[] titles = { "Frankestein", "King_Arthur_and_the_Round_Table" };
        String[] authors = { "Mary_Shelley", "Rosemary_Sutcliff" };
        int changeIndex = 1;
        String newTitle = "Treasure_Island";
        String newAuthor = "Robert_Louis_Stevenson";

        // Create library and add books
        Library1 library = new Library1(libraryName);
        for (int i = 0; i < titles.length; i++) {
            library.addBook(new Book1(titles[i], authors[i]));
        }

        // Display original library
        System.out.println("Original Library :");
        library.display();

        // Modify the book at changeIndex
        library.books.get(changeIndex).title = newTitle;
        library.books.get(changeIndex).author = newAuthor;

        System.out.println("\nAfter Modifications :");
        library.display();

        // Create shallow clone
        Library1 shallowClonedLibrary = library.shallowClone();

        // Create deep clone
        Library1 deepClonedLibrary = library.deepClone();

        // Display shallow clone
        System.out.println("\nShallow Clone :");
        shallowClonedLibrary.display();

        // Display deep clone
        System.out.println("\nDeep Clone :");
        deepClonedLibrary.display();
    }   
}
