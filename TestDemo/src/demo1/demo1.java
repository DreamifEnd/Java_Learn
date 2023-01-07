package demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuyan
 * Date: 2023-01-07
 * Time: 14:24
 */
interface A {
    void fun();
}
class B implements A {

    @Override
    public void fun() {
        System.out.println("hahaha");
    }
}
public class demo1 {
    public static void main(String[] args) {
        A a = new B();
        a.fun();
    }
}
