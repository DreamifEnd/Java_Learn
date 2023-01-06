import java.lang.reflect.Array;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuyan
 * Date: 2023-01-06
 * Time: 22:10
 */
public class Test {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] array = new int[3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(100);
            }
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][i];
            if (i!= array.length/2) {
                sum += array[array.length-i-1][i];
            }
        }
        System.out.println(sum);
    }
}
