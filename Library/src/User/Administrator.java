package User;

import Book.BookList;
import Opera.*;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuyan
 * Date: 2023-01-08
 * Time: 9:24
 */
public class Administrator extends User{

    public Administrator(String name) {
        super(name);
        this.ioperation = new IOperation[]{
                new ExitOperation(),
                new AddOperation(),
                new DelOperation(),
                new FindOperation(),
                new ShowOperation()
        };
    }
    public int menu()
    {
        System.out.println("************************");
        System.out.println("hello,"+name+"  欢迎来到图书管理系统");
        System.out.println("请选择要进行的操作");
        System.out.println("1.添加图书");
        System.out.println("2.删除图书");
        System.out.println("3.查找图书");
        System.out.println("4.显示图书");
        System.out.println("0.退出系统");
        System.out.println("************************");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }


}
