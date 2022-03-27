package leetcode;

public class Hot105 {
    public static void main(String[] args) {

    }

    /**
     * 递归方式
     * */
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null || preorder.length == 0 ||
                inorder.length == 0 || preorder.length != inorder.length) {
            return null;
        }
        return myBuildTree(preorder, 0, preorder.length - 1,
                inorder, 0, inorder.length - 1);
    }

    public TreeNode myBuildTree(int[] pre, int i, int j, int[] in, int m, int n) {
        int rootValue = pre[i];
        int rootIndex = findIndex(rootValue, in, m, n);
        TreeNode root = new TreeNode(rootValue);
        if (rootIndex < 0) {
            return null;
        }
        int leftNodes = rootIndex - m;
        int rightNodes = n - rootIndex;
        if (leftNodes == 0) {
            root.left = null;
        } else {
            root.left = myBuildTree(pre, i + 1, i + leftNodes,
                    in, m, m + leftNodes - 1);
        }

        if (rightNodes == 0) {
            root.right = null;
        } else {
            root.right = myBuildTree(pre, i + leftNodes + 1, j,
                    in, n - rightNodes + 1, n);
        }
        return root;
    }

    public int findIndex(int target, int[] in, int m, int n) {
        for (int i = m; i <= n; i++) {
            if (in[i] == target) {
                return i;
            }
        }
        return -1;
    }


}
