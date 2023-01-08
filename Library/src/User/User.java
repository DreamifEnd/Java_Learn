package User;

import Book.BookList;
import Opera.IOperation;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuyan
 * Date: 2023-01-08
 * Time: 9:24
 */
public abstract class User {
    protected IOperation[] ioperation;
    protected String name;
    public User(String name){
        this.name = name;
    }

    public IOperation[] getIoperation() {
        return ioperation;
    }

    public void setIoperation(IOperation[] ioperation) {
        this.ioperation = ioperation;
    }

    public abstract int menu();
}
