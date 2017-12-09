package com.leo.leetcode;

import lombok.Data;

/**
 * Created by lionel on 17/12/9.
 */
@Data
public class TreeNode {
    Integer val;
    TreeNode left;
    TreeNode right;

    public TreeNode(Integer val){
        this.val=val;
    }
}
