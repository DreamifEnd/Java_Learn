import Book.Book;
import Book.BookList;
import Opera.IOperation;
import User.*;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuyan
 * Date: 2023-01-08
 * Time: 9:29
 */
public class Main {
    public static User login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的名字: ");
        String name = scanner.nextLine();
        System.out.println("请输入你的身份: 1.管理员    0.访客");
        int choice = scanner.nextInt();
        if(choice==1) {
            return new Administrator(name);
        } else if(choice == 0){
            return new NormalUser(name);
        } else {
            throw new UserNameException("输入错误");
        }

    }
    public static void main(String[] args) {
        User user = login();
        Book book = new Book();
        BookList bookList = new BookList(book);
        while (true){
            int choice = user.menu();
            IOperation iOperation = user.getIoperation()[choice];
            iOperation.work(bookList);
        }

    }
}
