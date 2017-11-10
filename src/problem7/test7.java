package problem7;

public class test7 {
    public static void main(String[] args) {
        int[] pre ={1,2,4,7,3,5,6,8};
        int[] in = {4,7,2,1,5,3,8,6};
        Solution solution = new Solution();
        TreeNode tree = solution.reConstructBinaryTree(pre,in);
        preOrder(tree);

    }
    public static void preOrder(TreeNode root){
        if(root == null){
            return;
        }
        System.out.println(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }
}
