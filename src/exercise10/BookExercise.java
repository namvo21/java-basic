package exercise10;

public class BookExercise {

    private int ISBN;
    private String bookTitle;
    private String bookAuthor;
    private int bookYear;

    public BookExercise(int ISBN, String bookTitle, String bookAuthor, int bookYear) {
        this.ISBN = ISBN;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookYear = bookYear;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String title) {
        this.bookTitle = bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public int getBookYear() {
        return bookYear;
    }

    public void setBookYear(int bookYear) {
        this.bookYear = bookYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN=" + ISBN +
                ", title='" + bookTitle + '\'' +
                ", author='" + bookAuthor + '\'' +
                ", year=" + bookYear +
                '}';
    }
}
