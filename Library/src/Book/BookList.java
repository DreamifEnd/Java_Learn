package Book;

import User.User;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuyan
 * Date: 2023-01-08
 * Time: 9:21
 */
public class BookList {
    private Book[] books = new Book[20];
    private int useSize;

    public void setBook(int pos,Book book) {
        books[pos] = book;
    }
    public Book getBook(int i) {
        return books[i];
    }

    public BookList(Book books) {
        this.books[0] = books;
        useSize++;
    }

    public int getUseSize() {
        return useSize;
    }

    public void setUseSize(int useSize) {
        this.useSize = useSize;
    }
    public void doWork(int choice) {

    }
}
