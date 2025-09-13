package Collection;

import java.util.*;

class Library {
    
    private List<String> books = new ArrayList<>();
    
    
    private Set<String> issuedBooks = new HashSet<>();
    
    
    private Map<Integer, String> members = new HashMap<>();
    
    
    public void addBook(String bookName) {
        books.add(bookName);
        System.out.println(bookName + " added to library.");
    }
    
    
    public void showBooks() {
        System.out.println("\nAvailable Books:");
        for (String book : books) {
            if (!issuedBooks.contains(book)) {
                System.out.println("- " + book);
            }
        }
    }
    
    
    public void addMember(int id, String name) {
        members.put(id, name);
        System.out.println("Member added: " + name);
    }
    
    
    public void issueBook(String bookName, int memberId) {
        if (books.contains(bookName) && !issuedBooks.contains(bookName)) {
            issuedBooks.add(bookName);
            System.out.println(bookName + " issued to " + members.get(memberId));
        } else {
            System.out.println("Book not available.");
        }
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Library lib = new Library();
        
       
        lib.addBook("Java Programming");
        lib.addBook("Data Structures");
        lib.addBook("Operating System");
        
       
        lib.addMember(1, "Nandhini");
        lib.addMember(2, "Rahul");
        
        
        lib.showBooks();
        
        
        lib.issueBook("Java Programming", 1);
        
       
        lib.showBooks();
    }
}
