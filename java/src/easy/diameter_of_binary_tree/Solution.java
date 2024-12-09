package easy.diameter_of_binary_tree;

import easy.search_in_bst.TreeNode;

class Solution {
    private int diameter = 0;

public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return diameter;
    }

    private int dfs(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftDepth = dfs(node.left);
        int rightDepth = dfs(node.right);

        diameter = Math.max(diameter, leftDepth + rightDepth);

        return Math.max(leftDepth, rightDepth) + 1;
    }
}