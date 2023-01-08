package Opera;

import Book.BookList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuyan
 * Date: 2023-01-08
 * Time: 10:09
 */
public class ShowOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        //System.out.println("显示图书");
        for (int i = 0; i < bookList.getUseSize(); i++) {
            System.out.println(bookList.getBook(i).toString());
        }
    }
}
