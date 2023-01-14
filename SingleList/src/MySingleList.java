/**
 * Created with IntelliJ IDEA.
 * @Description:
 * @Author: xuyan
 * @Date: 2023-01-14
 * @Time: 10:49
 */
public class MySingleList {
    Node head;
    static class Node {
        int value;
        Node next;
        public Node(int value) {
            this.value = value;
        }
    }
    public void createList() {
        Node node1 = new Node(12);
        Node node2 = new Node(12);
        Node node3 = new Node(12);
        Node node4 = new Node(12);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        head = node1;
    }

    /**
     * 遍历链表
     */
    public void display() {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.value+" ");
            cur = cur.next;
        }
        System.out.println();
    }

    /**
     *
     * @return size
     */
    public int size() {
        int cost = 0;
        Node cur = head;
        while (cur != null) {
            cost++;
            cur = cur.next;
        }
        return cost;
    }

    /**
     * 查找是否有所输入的变量
     * @param key value
     * @return TF
     */
    public boolean contains(int key) {
        Node cur = head;
        while (cur != null) {
            if(cur.value==key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    /**
     * 头插
     * @param key value
     */
    public void addFirst(int key) {
        Node node = new Node(key);
        node.next = head;
        head = node;
    }

    /**
     * 尾插
     * @param key value
     */
    public void addLast(int key) {
        Node node = new Node(key);
        if(head == null) {
            head = node;
            return;
        }
        Node cur = head;
        while (cur.next!=null) {
            cur = cur.next;
        }
        cur.next = node;
    }

    /**
     * 在指定下标处插入数据
     * @param index 下标
     * @param data 数据
     */
    public void addIndex(int index,int data) {
        if(index == 0) {
            addFirst(data);
            return;
        }
        if(index == size()) {
            addLast(data);
            return;
        }
        indexCheck(index);
        Node node = new Node(data);
        Node cur = findIndexSubOne(index);
        node.next = cur.next;
        cur.next = node;
    }

    /**
     * 找到下标处前一位结点
     * @param index 下标
     * @return 下标处前一位结点
     */
    private Node findIndexSubOne(int index) {
        Node cur = head;
        int count = 0;
        if(cur == null){
            return null;
        }
        while (count!=index-1) {
            cur = cur.next;
            count++;
        }
        return cur;
    }

    /**
     * 检查下标是否合法
     * @param index 下标
     */
    public void indexCheck(int index) {
       if(index < 0 || index > size()) {
           throw new IndexOutOfBoundsException("下标输入错误!!");
       }

    }

    /**
     * 删除指定下标的数据
     * @param index 下标
     */
    public void delIndex(int index) {
        indexCheck(index);
        if(index == 0) {
            head = head.next;
            return;
        }
        Node cur = findIndexSubOne(index);
        if (cur != null && cur.next != null) {
            cur.next = cur.next.next;
        }else {
            throw new IndexOutOfBoundsException("请检查输入是否合法！！");
        }
    }

    /**
     * 删除第一次出现的指定数据
     * @param key 所删除的数据
     */
    public void remove(int key) {
        if(head == null) {
            return;
        }
        if(head.value == key) {
            head = head.next;
            return;
        }
        Node cur = findKey(key);
        if (cur != null) {
            cur.next = cur.next.next;
        } else {
            System.out.println("没找到！！");
        }
    }

    /**
     *
     * @param key 数据
     * @return 返回出现指定数据的前一个结点
     */
    private Node findKey(int key) {
        Node cur = head;
        while (cur.next != null) {
            if (cur.next.value == key) {
                return cur;
            }
            cur = cur.next;
        }
        return null;
    }

    /**
     * 删除所有指定数据的结点
     * @param key 数据
     */
    public void removeAllKey(int key ) {
        if(head == null) {
            return;
        }
        Node prev = head;
        Node cur = head.next;
        while (cur != null) {
            if(cur.value == key) {
                prev.next = cur.next;
            } else {
                prev = cur;
            }
            cur = cur.next;
        }
        if(head.value==key) {
            head = head.next;
        }
    }
    public void clear() {
        head = null;
    }
}