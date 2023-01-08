package Opera;

import Book.BookList;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuyan
 * Date: 2023-01-08
 * Time: 10:08
 */
public class ReturnOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        //System.out.println("借阅成功");
        System.out.println("输入你想归还的书籍名: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        if(FindOperation.checkBorrow(bookList,name)==null) {
            int subscript = FindOperation.findSubscript(bookList,name);
            if(bookList.getBook(subscript).isIs_Borrow()) {
                bookList.getBook(subscript).setIs_Borrow(false);
            }
        }
                System.out.println("归还成功！！");

    }
}
