package problem37;

public class Solution37 {
    public String Serialize(TreeNode root) {
        StringBuilder str = new StringBuilder();
        if(root == null) {
            str.append("$"+",");
            return str.toString();
        }
        str.append(root.val+",");
        str.append(Serialize(root.left));
        str.append(Serialize(root.right));
        return str.toString();

    }
    int index = -1;
    public TreeNode Deserialize(String str) {
        TreeNode root = null;
        index ++;
        if(str.isEmpty() || index >=str.length())
            return null;
        String[] strr = str.split(",");
        if(!strr[index].equals("$")){
            root = new TreeNode(Integer.valueOf(strr[index]));
            root.left = Deserialize(str);
            root.right = Deserialize(str);
        }
        return root;
    }
}
