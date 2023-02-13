import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
/**
 * Created with IntelliJ IDEA.
 *
 * @Description:
 * @Author: xuyan
 * @Date: 2023-01-17
 * @Time: 18:43
 */
public class MyStack {
    public static void main(String[] args) {
        //队列
        Deque<Integer> stack1 = new LinkedList<>();
        Queue<Integer> stack2 = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        stack.add(1);
        Integer s1 = stack.peek();
        stack.add(2);
        stack.add(2,10);
        Integer s2 = stack.pop();
        System.out.println(s2);
        stack.add(12);
        stack.peek();
        int a = 0;
        System.out.println(a);
    }
}
