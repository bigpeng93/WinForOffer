package problem34;

import java.util.ArrayList;

public class Solution34 {
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        ArrayList<ArrayList<Integer>> pathlist = new ArrayList<ArrayList<Integer>>();
        if(root == null || root.val > target){
            return pathlist;
        }
        ArrayList<Integer> path = new ArrayList<Integer>();
        pathRoad(root,target,path,pathlist);
        return pathlist;
    }

    private void pathRoad(TreeNode root , int target,ArrayList<Integer> path,ArrayList<ArrayList<Integer>> pathlist){
        if(root == null || root.val>target){
            path.clear();
        }else if(root.val == target){
            if(root.left == null && root.right ==null){
                path.add(root.val);
                pathlist.add(path);
            }else{
                path.clear();
            }
        }else {
            path.add(root.val);
            ArrayList<Integer> path2 = new ArrayList<Integer>();
            path2.addAll(path);
            target -= root.val;
            pathRoad(root.left,target,path,pathlist);
            pathRoad(root.right,target,path2,pathlist);
        }
    }

}
