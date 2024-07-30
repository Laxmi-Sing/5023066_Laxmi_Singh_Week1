package Data_Structures_And_Algorithms.LibraryManagementSystem;

public class Book {
    private int bookId;
    private String title;
    private String author;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title=title;
        this.author = author;
    }
    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", title=" + title +
                ", author=" + author +
                '}';
    }
    String getTitle(){
        return title;
    }

}
