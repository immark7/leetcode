package easy.two_sum_iv;

import common.TreeNode;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> seen = new HashSet<>();
        return dfs(root, k, seen);
    }

    private boolean dfs(TreeNode node, int k, Set<Integer> seen) {
        if (node == null) {
            return false;
        }

        if (seen.contains(k - node.val)) {
            return true;
        }

        seen.add(node.val);

        return dfs(node.left, k, seen) || dfs(node.right, k, seen);
    }
}