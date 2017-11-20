package problem55;

public class test55 {
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
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);

        Solution55One solution55One = new Solution55One();
        System.out.println(solution55One.TreeDepth(root));
        System.out.println(solution55One.IsBalanced_Solution(root));
    }
}
