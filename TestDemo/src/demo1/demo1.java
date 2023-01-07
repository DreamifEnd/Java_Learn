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
interface C {
    void fun2();
}
class B implements A,C {

    @Override
    public void fun() {
        System.out.println("hahaha");
    }

    @Override
    public void fun2() {
        System.out.println("666");
    }
}
public class demo1 {
    public static void main(String[] args) {
        A a = new B();
        a.fun();
    }
}
