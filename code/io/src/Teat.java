import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuyan
 * Date: 2022-12-20
 * Time: 19:26
 */
public class Teat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(a);
        float b = scanner.nextFloat();
        System.out.println(b);
        double c = scanner.nextDouble();
        System.out.println(c);
    }
    /*public static void main(String[] args) {
        int i = 1;
        int count = 0;
        while(i <= 100) {
            if(i/100==9||i/10%10==9||i%10==9) {
                count++;
            }
            i++;
        }
        System.out.println(count);
    }*/
    /*public static void main(String[] args) {
        int i = 1;
        while(i <= 100) {
            int j = 2;
            while(j <= i-1) {
                if (i%j==0) {
                    break;
                }
                j++;
            }
            if (j == i){
                System.out.print(i+" ");
            }
            i++;
        }
    }*/
}
