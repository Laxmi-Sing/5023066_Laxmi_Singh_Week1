package Data_Structures_And_Algorithms.LibraryManagementSystem;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Book b1=new Book(1,"The girl","XYZ");
        Book b2=new Book(2,"2020","ABC");
        Book b3=new Book(3,"Lazy","PQR");
        ArrayList<Book> books=new ArrayList<>();
        books.add(b1);
        books.add(b2);
        books.add(b3);
        System.out.println("Linear Search: "+BookSearch.linearSearch(books,"2020"));
        System.out.println("Binary search: "+BookSearch.binarySearch(books,"The girl"));
    }
}
