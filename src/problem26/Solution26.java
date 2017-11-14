package problem26;

public class Solution26 {
    public boolean HasSubTree(TreeNode root1,TreeNode root2){
        if(root2 == null)
            return false;
        if(root1 == null && root2 !=null){
            return false;
        }
        boolean result = false;
        if(root1 != null && root2!=null){
            if(root1.val == root2.val)
                result =  isHasTree(root1,root2);
            if(!result)
                result = isHasTree(root1.left,root2);
            if(!result)
                result = isHasTree(root1.right,root2);
        }
        return result;
    }
    public boolean isHasTree(TreeNode root1,TreeNode root2){
        if(root2 == null)
            return true;
        if(root1 == null)
            return false;
        if(!(root1.val == root2.val))
            return false;
        return isHasTree(root1.left,root2.left) && isHasTree(root1.right,root2.right);
    }
}
