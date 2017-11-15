package problem32;

import java.util.ArrayList;
import java.util.Stack;

public class Solution32Three {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        int index = 1;
        Stack<TreeNode> s1 = new Stack<>();
        s1.push(pRoot);
        Stack<TreeNode> s2 = new Stack<>();
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<ArrayList<Integer>>();
        while (!s1.isEmpty() || !s2.isEmpty()){
            if((index & 1) == 1){
                ArrayList<Integer> temp = new ArrayList<Integer>();
                while (!s1.isEmpty()){
                    TreeNode tempnode = s1.pop();
                    if(tempnode!=null) {
                        temp.add(tempnode.val);
                        System.out.print(tempnode.val+" ");
                        s2.push(tempnode.left);
                        s2.push(tempnode.right);
                    }
                }
                if(!temp.isEmpty()){
                    arrayList.add(temp);
                    index++;
                    System.out.println();
                }
            }else{
                ArrayList<Integer> temp = new ArrayList<Integer>();
                while (!s2.isEmpty()){
                    TreeNode tempnode = s2.pop();
                    if(tempnode!=null) {
                        temp.add(tempnode.val);
                        System.out.print(tempnode.val+" ");
                        s1.push(tempnode.right);
                        s1.push(tempnode.left);
                    }
                }
                if(!temp.isEmpty()){
                    arrayList.add(temp);
                    index++;
                    System.out.println();
                }
            }

        }
        return arrayList;
    }
}
