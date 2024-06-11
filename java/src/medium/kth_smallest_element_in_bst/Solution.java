package medium.kth_smallest_element_in_bst;

import easy.search_in_bst.TreeNode;

public class Solution {
    private int count = 0;
    private int result = Integer.MIN_VALUE;

    public int kthSmallest(TreeNode root, int k){
        inorder(root, k);
        return result;
    }

    private void inorder(TreeNode node, int k){
        if (node == null)
            return;

        inorder(node.left, k);

        count++;
        if (count == k) {
            result = node.val;
            return;
        }

        inorder(node.right, k);
    }
}
