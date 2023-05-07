package easy;

import java.util.ArrayList;
import java.util.List;

import model.TreeNode;

/**
 * https://leetcode.com/problems/binary-tree-preorder-traversal/
 */
public class PreorderTraversal {

    private PreorderTraversal() {
    }

    /**
     * See https://en.wikipedia.org/wiki/Depth-first_search
     * @param root
     * @return
     */
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> orderedValue = new ArrayList<>();
        if (root != null){
            orderedValue.add(root.val);
        } else {
            //In case root is null.
            return new ArrayList<>();
        }
        if (root.left != null){
            orderedValue.addAll(preorderTraversal(root.left));
        }
        if (root.right != null){
            orderedValue.addAll(preorderTraversal(root.right));
        }
        return orderedValue;
    }
}
