package com.leo.leetcode;

/**
 * Created by lionel on 17/12/9.
 */
public class MergeTwoBinaryTrees_617 {
    public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null) {
            return t2;
        }
        if (t2 == null) {
            return t1;
        }
//        TreeNode tmp_t1 = t1;
//        TreeNode tmp_t2 = t2;
        int value = t1.getVal() + t2.getVal();
        TreeNode t = new TreeNode(value);
        t.setLeft(mergeTrees(t1.getLeft(), t2.getLeft()));
        t.setRight(mergeTrees(t1.getRight(), t2.getRight()));
        return t;
    }
}
