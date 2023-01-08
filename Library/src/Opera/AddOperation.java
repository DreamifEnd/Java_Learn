package Opera;

import Book.Book;
import Book.BookList;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuyan
 * Date: 2023-01-08
 * Time: 9:27
 */
public class AddOperation implements IOperation{

    private void get() {

    }

    @Override
    public void work(BookList bookList) {
        //System.out.println("新增图书");
        System.out.println("输入你想添加的书籍名: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int useSize = bookList.getUseSize();
        if(FindOperation.find(bookList,name)) {
            System.out.println("已经有这本书了哦！");
        } else {
            Book book = new Book();
            book.setName(name);
            System.out.println("输入你想添加的书籍的作者: ");
            book.setAuthor(scanner.nextLine());
            System.out.println("输入你想添加的书籍的价格: ");
            book.setPrice(scanner.nextInt());
            bookList.setBook(useSize,book);
            System.out.println("添加成功!!");
        }
        bookList.setUseSize(useSize+1);
    }

}
