package Data_Structures_And_Algorithms.LibraryManagementSystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BookSearch {
    public static Book linearSearch(ArrayList<Book> books,String title){
        for(Book book:books){
            if(book.getTitle().equals(title)){
                return book;
            }
        }
        return null;
    }
    public static Book binarySearch (ArrayList<Book> books,String title){

        Collections.sort(books, Comparator.comparing(Book::getTitle));
        int start=0;
        int end=books.size()-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            Book midBook=books.get(mid);
            int comparison=midBook.getTitle().compareTo(title);
            if (comparison == 0) {
                return midBook;
            } else if (comparison < 0) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return null;
    }

}
