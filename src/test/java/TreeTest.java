import com.leo.leetcode.TreeNode;

import java.util.*;

/**
 * Created by lionel on 18/1/7.
 */
public class TreeTest {
    private static List<Integer> list = new ArrayList<>();

    public static void inOrder(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        inOrder(treeNode.getLeft());
        list.add(treeNode.getVal());
        inOrder(treeNode.getRight());
    }

    public static int kthSmallest(TreeNode root, int k) {
        inOrder(root);
        return list.get(k-1);

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(1);
        TreeNode right = new TreeNode(2);
        root.setLeft(null);
        root.setRight(right);
        inOrder(root);
//        list.stream().forEach(System.out::println);
        System.out.println(kthSmallest(root, 2));
    }
}
