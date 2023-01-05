import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuyan
 * Date: 2023-01-03
 * Time: 19:57
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] high = new int[10];
        for (int i = 0; i < 10; i++) {
            high[i] = scanner.nextInt();
        }
        int input = scanner.nextInt();
        int cost = 0;
        for (int i = 0; i < 10; i++) {
            if(high[i] > input + 30) {
                cost++;
            }
        }
        System.out.println(cost);
    }
}
