import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuyan
 * Date: 2022-12-21
 * Time: 23:33
 */
public class Test {
    public static float Get_Max(float a,float b,float c) {
        return c > (a > b ? a : b) ? c : (a > b ? a : b);
    }
    public static int Get_Max(int a,int b) {
        return a > b ? a : b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int ret1 = Get_Max(a,b);
        float c = scanner.nextFloat();
        float d = scanner.nextFloat();
        float e = scanner.nextFloat();
        float ret2 = Get_Max(c,d,e);
        System.out.println(ret1);
        System.out.println(ret2);
        scanner.close();
    }
}
