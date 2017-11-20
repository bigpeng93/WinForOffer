package problem54;

import java.util.Stack;

public class Solution54 {
    public TreeNode KthNode(TreeNode root,int k) {
        if (root == null || k <= 0)
            return null;


        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode index = root;
        int count =0;
        while (!stack.isEmpty() || index !=null){
            if(index != null){
                stack.push(index);
                index = index.left;
            }else {
                index = stack.pop();
                count ++;
                if (count ==k)
                    return index;
                index = index.right;
            }
        }
        return null;

    }
}
