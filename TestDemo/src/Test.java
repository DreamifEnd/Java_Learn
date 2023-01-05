/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuyan
 * Date: 2023-01-05
 * Time: 17:55
 */
class Base {
    public int a;
    public int b;
    public int c;
}
class Derived extends Base {
    public  int c;

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    void fun() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(super.c);
    }
}
public class Test {
    public static void main(String[] args) {
        Derived derived = new Derived();
        derived.fun();
    }
    public static void main1(String[] args) {
        int a = 0;
        System.out.println(a);
    }
}
