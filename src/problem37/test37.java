package problem37;

public class test37 {
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
        Solution37 solution37 = new Solution37();
        String str = solution37.Serialize(root);
        System.out.println(str);

        System.out.println(solution37.Deserialize(str).val);

    }
}
