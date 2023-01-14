/**
 * Created with IntelliJ IDEA.
 *
 * @Description:
 * @Author: xuyan
 * @Date: 2023-01-14
 * @Time: 10:20
 */
public class Test {
    public static void main(String[] args) {
        MySingleList list = new MySingleList();
        list.createList();
        boolean b = list.contains(12);
        list.addFirst(1);
        list.addLast(2);
        list.addIndex(2,20);
        list.delIndex(2);
        list.display();
        list.remove(12);
        list.display();

    }

}
