package Opera;

import Book.Book;
import Book.BookList;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuyan
 * Date: 2023-01-08
 * Time: 10:03
 */
public class FindOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        //System.out.println("查找图书");
        System.out.println("输入你要查找的书籍名: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        for (int i = 0; i < bookList.getUseSize(); i++) {
            Book book = bookList.getBook(i);
            if(name.compareTo(book.getName())==0) {
                System.out.println("找到了");
                System.out.println(book.toString());
            } else {
                System.out.println("没有该书");
            }
        }
    }
    public static boolean find(BookList bookList,String name) {
        for (int i = 0; i < bookList.getUseSize(); i++) {
            Book book = bookList.getBook(i);
            if (name.compareTo(book.getName()) == 0) {
                return true;
            }
        }
        return false;
    }
    public static boolean find(BookList bookList) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        for (int i = 0; i < bookList.getUseSize(); i++) {
            Book book = bookList.getBook(i);
            if (name.compareTo(book.getName()) == 0) {
                return true;
            }
        }
        return false;
    }
    public static int findSubscript(BookList bookList,String name) {
        for (int i = 0; i < bookList.getUseSize(); i++) {
            Book book = bookList.getBook(i);
            if (name.compareTo(book.getName()) == 0) {
                return i;
            }
        }
        return -1;
    }
    public static Book checkBorrow(BookList bookList,String name) {
//        for (int i = 0; i < bookList.getUseSize(); i++) {
//            Book book = bookList.getBook(i);
//            if (book.isIs_Borrow()) {
//                return true;
//            }
//        }
//        return false;
        int subscript = findSubscript(bookList,name);
        if(bookList.getBook(subscript).isIs_Borrow()) {
            return null;
        }
        return bookList.getBook(subscript);
    }
}
