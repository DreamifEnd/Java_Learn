import java.util.ArrayList;
/**
 * @author xuyan
 */
public class Demo3 {
    public static void main(String[] args) {
        String s1 = "welcome to bit";
        String s2 = "come";
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < s1.length(); i++) {
            char ch =s1.charAt(i);
            if (!s2.contains(ch+" ")) {
                    list.add(ch);
            }
        }
        System.out.println(list);
    }
    public static void main1(String[] args) {
        String s1 = "welcome to bit";
        String s2 = "come";
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        ArrayList<Character> arrayList = new ArrayList<>();
        for (char value : c1) {
            arrayList.add(value);
        }
        for (char c : c2) {
            while (arrayList.remove(new Character(c))) {
                ;
            }
        }
        System.out.println(arrayList);
    }
}
