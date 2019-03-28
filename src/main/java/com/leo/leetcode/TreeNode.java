package com.leo.leetcode;


/**
 * Created by lionel on 17/12/9.
 */

public class TreeNode {
    Integer val;
    TreeNode left;
    TreeNode right;

    public TreeNode(Integer val) {
        this.val = val;
    }


    public Integer getVal() {
        return val;
    }

    public void setVal(Integer val) {
        this.val = val;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}
