package problem36;

public class Solution36 {
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree == null)
            return null;
        if(pRootOfTree.left == null && pRootOfTree.right == null)
            return pRootOfTree;

        TreeNode lefttemp= Convert(pRootOfTree.left);
        TreeNode p =lefttemp;
        while ( p!=null && p.right!=null ){
            p = p.right;
        }
        if(lefttemp!=null) {
            p.right = pRootOfTree;
            pRootOfTree.left = p;
        }
        TreeNode righttemp = Convert(pRootOfTree.right);

        if(righttemp != null) {
            righttemp.left = pRootOfTree;
            pRootOfTree.right = righttemp;
        }

        return lefttemp!=null ? lefttemp:pRootOfTree;
    }
}
