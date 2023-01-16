/**
 * Created with IntelliJ IDEA.
 *
 * @Description:
 * @Author: xuyan
 * @Date: 2023-01-15
 * @Time: 3:25
 */
public class MyLinkList {
    Node head;
    class Node {
        int value;
        Node next;
        public Node() {
            this.value = 0;
        }
        public Node(int value) {
            this.value = value;
        }
    }

    /**
     * 创建链表
     */
    public void createList() {
        head =new Node();
        Node node1 =new Node(12);
        Node node2 =new Node(13);
        Node node3 =new Node(14);
        Node node4 =new Node(13);
        Node node5 =new Node(15);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
    }

    /**
     * 头插
     * @param data
     */
    public void addFirst(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    /**
     * 尾插
     * @param data
     */
    public void addLast(int data) {
        Node node = new Node(data);
        if(head == null) {
            head = node;
            return;
        }
        Node cur = head;
        while (cur.next != null) {
            cur= cur.next;
        }
        cur.next = node;
    }

    /**
     * 链表长度
     * @return
     */
    public int size() {
        Node cur = head;
        int count = 0;
        while (cur != null) {
            count++;
        }
        return count;
    }

    /**
     * 检查下标是否合法
     * @param index
     */
    private void indexCheak(int index) {
        if(index<0||index>size()) {
            throw new IndexOutOfBoundsException("下标输入非法!!");
        }
    }

    /**
     * 任意位置插入
     * 为啥方法返回值是boolean？
     * @param index
     * @param data
     * @return
     */
    public boolean addIndex(int index,int data) {
         if(index == 0) {
             addFirst(data);
         }
         if(index == size()) {
             addLast(data);
         }
         indexCheak(index);
         Node cur = head;
         Node node = new Node(data);
         for (int i = 0; i < index-1; i++) {
             cur= cur.next;
         }
         node.next = cur.next;
         cur.next = node;
         return true;
    }

    /**
     * 查找key是否在单链表中
     * @param key
     * @return
     */
    public boolean contains(int key) {
        Node cur = head;
        while (cur != null) {
            if(cur.value==key) {
                return true;
            }
        }
        return false;
    }

    /**
     * 删除第一次出现关键字位key的结点
     * @param key
     */
    public void remove(int key) {
        Node cur = head;
        while (cur != null) {
            if(cur.next.value == key) {
                cur.next = cur.next.next;
            }
        }
    }

    /**
     * 删除所有值位key的结点
     * @param key
     */
    public void removeAllKey(int key) {
        if(head == null) {
            return;
        }
        Node slow = head;
        Node fast = head.next;
        while (fast != null) {
            if(fast.value == key) {
                slow.next = fast.next;
                fast=fast.next;
            } else {
                slow = fast;
                fast = fast.next;
            }
        }
        if(slow.value==key) {
            head= head.next;
        }
    }

    /**
     * 打印链表
     */
    public void display() {
        Node cur = head;
        while(cur != null) {
            System.out.println(cur.value+" ");
        }
        System.out.println();
    }

    /**
     * 清除链表
     */
    public void clear() {
        head = null;
    }

}
