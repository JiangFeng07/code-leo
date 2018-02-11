package com.leo.JianzhiOffer;

import com.leo.leetcode.TreeNode;

/**
 * Created by lionel on 18/2/9.
 */
public class BuildBinaryTree {
    public static TreeNode construct(int[] preorder, int[] inorder) {
        if (preorder == null || preorder.length == 0 || inorder == null || inorder.length == 0) {
            return null;
        }

        return construct(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);

    }

    private static TreeNode construct(int[] preorder, int pb, int pe, int[] inorder, int ib, int ie) {
        if (pb > pe) {
            return null;
        }
        int value = preorder[pb];
        int index = ib;
        while (index < ie && inorder[index] != value) {
            index += 1;
        }

        if (index > ie) {
            return null;
        }

        TreeNode node = new TreeNode(value);
        node.setLeft(construct(preorder, pb + 1, pb + index - ib, inorder, ib, index - 1));
        node.setRight(construct(preorder, pb + index - ib + 1, pe, inorder, index + 1, ie));
        return node;
    }
}
