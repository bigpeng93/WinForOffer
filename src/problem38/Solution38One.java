package problem38;

import java.util.ArrayList;
import java.util.TreeSet;

public class Solution38One {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> result = new ArrayList<String>();
        if(str == null || str.length() ==0)
            return result;
        char[] strs = str.toCharArray();
        //System.out.println(strs.length);
        TreeSet<String> temp = new TreeSet<String>();
        Permutation(strs,0,temp);
        result.addAll(temp);
        return result;
    }

    private void Permutation(char[] strs, int begin,TreeSet<String> temp){
        if(strs == null ||strs.length<=0 || begin<0|| begin>strs.length-1  )
            return;
        if(begin == strs.length-1)
            temp.add(String.valueOf(strs));
        else{
            for(int i = begin;i<strs.length;i++){
                swap(strs,begin,i);
                Permutation(strs,begin+1,temp);
                swap(strs,begin,i);
            }

        }

    }
    private void swap(char[] x,int a,int b){
        char temp = x[a];
        x[a] = x[b];
        x[b] =temp;

    }
}
