import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description:
 * @Author: xuyan
 * @Date: 2023-02-13
 * @Time: 15:43
 */
public class Test {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        tree.insert(6);
        tree.insert(8);
        tree.insert(10);

        System.out.println("Pre-order traversal:");
        tree.preOrderTraversal();
        System.out.println();
        System.out.println("In-order traversal:");
        tree.inOrderTraversal();
        System.out.println();

        System.out.println("Post-order traversal:");
        tree.postOrderTraversal();
        System.out.println();
        System.out.println(tree.find(tree.root,1).val);
        List<List<Integer>> list = tree.level();
        System.out.println(list);
    }
}
