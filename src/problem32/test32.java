package problem32;

public class test32 {
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
        root.right.right = new TreeNode(7);
        /*Solution32Two solution32Two = new Solution32Two();
        solution32Two.PrintTreeForLine(root);*/
        Solution32Three solution32Three = new Solution32Three();
        solution32Three.Print(root);
    }
}
