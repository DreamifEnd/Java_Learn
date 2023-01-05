import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuyan
 * Date: 2022-12-26
 * Time: 19:17
 */
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         input = scanner.next();
        if(input >= 65 && input < 97) {
            System.out.println((char)input);
        } else {
            System.out.println((char)(input+26));
        }
    }
}
