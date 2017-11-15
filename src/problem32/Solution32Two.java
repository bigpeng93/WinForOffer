package problem32;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution32Two {
    public void PrintTreeForLine(TreeNode root){
        ArrayList<Integer> list = new ArrayList<>();
        if(root == null)
            return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            for(int i = queue.size();i>0;i--) {
                TreeNode treeNode = queue.poll();
                System.out.print(treeNode.val);
                System.out.print("\t");
                if (treeNode.left != null) {
                    queue.offer(treeNode.left);
                }
                if (treeNode.right != null) {
                    queue.offer(treeNode.right);
                }
                list.add(treeNode.val);
            }
            System.out.println();
        }
    }
}
