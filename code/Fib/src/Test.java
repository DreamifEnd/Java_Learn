/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuyan
 * Date: 2022-12-22
 * Time: 16:39
 */
public class Test {
    public static int fib(int n) {
        int a = 1;
        int b = 1;
        int c = 1;
        for (int i = 2; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static void main(String[] args) {
        int ret = fib(10);
        System.out.println(ret);
    }
}
