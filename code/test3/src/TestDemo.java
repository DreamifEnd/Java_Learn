import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuyan
 * Date: 2022-12-19
 * Time: 20:55
 */
public class TestDemo {
    public static void main(String[] args) {
        {
            int a = 10;
            System.out.println(a);
        }
        int a = 100;
        System.out.println(a);
    }
    public static void main2(String[] args) {
        int[] array = new int[]{1,21,3,41,5};
        Arrays.sort(array);
        String ret = Arrays.toString(array);
        System.out.println(ret);
    }
    public static void main1(String[] args) {
        System.out.println("Hello World");
        long a = 100L;
        System.out.println(a);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
    }
}
