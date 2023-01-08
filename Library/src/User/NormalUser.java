package User;

import Book.BookList;
import Opera.*;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuyan
 * Date: 2023-01-08
 * Time: 9:23
 */
public class NormalUser extends User{
    public NormalUser(String name) {
        super(name);
        this.ioperation = new IOperation[]{
                new ExitOperation(),
                new BorrowOperation(),
                new ReturnOperation(),
                new FindOperation(),
                new ShowOperation()
        };
    }
    public int menu()
    {
        System.out.println("************************");
        System.out.println("hello,"+name+"  欢迎来到图书管理系统");
        System.out.println("请选择要进行的操作");
        System.out.println("1.借阅图书");
        System.out.println("2.归还图书");
        System.out.println("3.查找图书");
        System.out.println("4.显示图书");
        System.out.println("0.退出系统");
        System.out.println("************************");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

}
