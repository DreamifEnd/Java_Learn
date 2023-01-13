package Opera;

import Book.Book;
import Book.BookList;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuyan
 * Date: 2023-01-08
 * Time: 10:04
 */
public class DelOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("输入你想删除的书籍名: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int useSize = bookList.getUseSize();
        if(FindOperation.find(bookList,name)) {
            int subscript = FindOperation.findSubscript(bookList,name);
            for (int i = subscript ; i < useSize - 1; i++) {
                bookList.setBook(i,bookList.getBook(i+1));
            }
            bookList.setBook(useSize - 1,null);
            bookList.setUseSize(useSize-1);
            System.out.println("删除成功");
        } else {
            System.out.println("该书本不存在！！");
        }

    }
}
