package Demo5;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description:
 * @Author: xuyan
 * @Date: 2023-01-15
 * @Time: 21:19
 */
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
public class Test {
    public  boolean chkPalindrome(ListNode A) {
        if(A == null) {
            return true;
        }
        if (A.next == null) {
            return true;
        }
        int count = 0;
        ListNode right = A;
        ListNode cur = A;
        while (cur!=null) {
            count++;
        }
        for (int i = 0; i < count/2; i++) {
            right = right.next;
        }
        if(count%2 != 0) {
            right = right.next;
        }
        ListNode head =right;
        right = right.next;
        ListNode nextNode = right;
        while (right != null) {
            nextNode = right;
            right = right.next;
            nextNode.next = head;
            head = nextNode;
        }
        ListNode cur1 = A;
        ListNode cur2 = head;
        for (int i = 0; i < count / 2; i++) {
            if (cur1.val!=cur2.val) {
}               return false;
        }
        return true;
    }
    public static void main(String[] args) {
        
        chkPalindrome();
    }
    }
}
