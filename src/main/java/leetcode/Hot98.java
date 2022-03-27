package leetcode;

import java.util.Deque;
import java.util.LinkedList;

public class Hot98 {
    public static void main(String[] args) {
        ThreadLocal threadLocal = new ThreadLocal();

    }

    public boolean isValidBST(TreeNode root) {
        Deque<TreeNode> stack = new LinkedList<>();
        double inorder = -Double.MAX_VALUE;
        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }

            root = stack.pop();
            if (root.val <= inorder) {
                return false;
            }
            inorder = root.val;
            root = root.right;
        }
        return true;
    }
}
