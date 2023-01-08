package Book;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuyan
 * Date: 2023-01-08
 * Time: 9:16
 */
public class Book {
    private String name;
    private String author;
    private int price;
    private boolean is_Borrow;

    public Book() {
        this.name= "西游记" ;
        this.author = "吴承恩";
        this.price  = 20;
    }
    public Book(String name , String author , int price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isIs_Borrow() {
        return is_Borrow;
    }

    public void setIs_Borrow(boolean is_Borrow) {
        this.is_Borrow = is_Borrow;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", is_Borrow=" + is_Borrow +
                '}';
    }
}
