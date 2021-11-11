package leetcode;

public class offer5 {
    public static void main(String[] args) {

    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null || preorder.length == 0
                || inorder.length == 0 || preorder.length != inorder.length) {
            return null;
        }
        return reBuild(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    public TreeNode reBuild(int pre[], int i, int j, int in[], int m, int n) {
        int rootValue = pre[i];
        int index = findNode(rootValue, in, m, n);
        TreeNode root = new TreeNode(rootValue);
        if (index < 0) return null;
        int rightNodes = n - index;
        int leftNodes = index - m;
        if (leftNodes == 0) {
            root.left = null;
        } else {
            root.left = reBuild(pre, i + 1, i + leftNodes, in, m, m + leftNodes - 1);
        }
        if (rightNodes == 0) {
            root.right = null;
        } else {
            root.right = reBuild(pre, i + leftNodes + 1, j, in, n - rightNodes + 1, n);
        }
        return root;
    }

    public int findNode(int target, int[] array, int start, int end) {
        for (int i = start; i <= end; i++) {
            if (array[i] == target) return i;
        }
        return -1;
    }
}
