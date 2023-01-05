import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuyan
 * Date: 2022-12-21
 * Time: 20:18
 */
public class Test {

    public static int And (int a, int b) {
        return a + b ;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int ret = And(a,b);
        System.out.println(ret);
    }
}
