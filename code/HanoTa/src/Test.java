/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuyan
 * Date: 2023-01-02
 * Time: 12:14
 */
public class Test {
    public static void hano(int n,char pos1,char pos2,char pos3) {
        if (n == 1) {
            move(pos1,pos3);
            return;
        }
        hano(n-1,pos1,pos3,pos2);
        System.out.println();
        move(pos1, pos3);
        System.out.println();
        hano(n-1,pos2,pos1,pos3);
    }
    public static void move(char pos1,char pos2) {
        System.out.print(pos1+"->"+pos2+" ");
    }

    public static void main(String[] args) {
        hano(4,'A','B','C');
    }
}
