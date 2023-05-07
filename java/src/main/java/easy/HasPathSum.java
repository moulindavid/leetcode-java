package easy;


import model.TreeNode;

/**
 * https://leetcode.com/problems/path-sum/
 */
public class HasPathSum {

    private HasPathSum() {
    }

    /**
     * Check if the current node is a leaf and that the target sum minus its value is equal to zero, if the node is not a leaf
     * we check subtract the value of the node to the  target sum and recursively look down the tree if we will end up having a path
     * which sum is equal to the target sum.
     * @param root the root tree node we are looking for a path having the given sum.
     * @param targetSum the targeted path sum.
     * @return
     */
    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null && targetSum - root.val == 0) {
            return true;
        }
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }
}
