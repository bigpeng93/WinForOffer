package problem34;

public class test34 {
    public static void main(String[] args) {
        //            1
        //          /   \
        //         2     3
        //       /  \   / \
        //      4    5 6   7
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(8);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        Solution34 solution34 = new Solution34();
        System.out.println(solution34.FindPath(root,11));
    }
}
