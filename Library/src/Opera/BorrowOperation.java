package Opera;

import Book.Book;
import Book.BookList;

import java.util.Objects;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuyan
 * Date: 2023-01-08
 * Time: 10:06
 */
public class BorrowOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("输入你想借阅的书籍名: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        if(FindOperation.find(bookList,name)) {
            if(FindOperation.checkBorrow(bookList,name)!=null) {
              FindOperation.checkBorrow(bookList, name).setIs_Borrow(true);
                System.out.println("借阅成功！！");
            }
        } else {
            System.out.println("没有该书！！");
        }
    }
}
