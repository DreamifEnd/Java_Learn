/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuyan
 * Date: 2022-12-26
 * Time: 18:17
 */
public class Test {
    public static void main(String[] args) {
        float sum = 0;
        for (double i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum -= 1 / i;
            } else {
                sum += 1 / i;
            }
        }
            System.out.println(sum);
    }
}
