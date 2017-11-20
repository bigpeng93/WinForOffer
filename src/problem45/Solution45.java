package problem45;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Solution45 {
    public String PrintMinNumber(int [] numbers) {
        if(numbers.length==0||numbers == null)
            return null;
        int n= 0;
        String s="";
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i<numbers.length;i++){
            list.add(numbers[i]);
        }
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer str1, Integer str2) {

                String s1= str1+""+str2;
                String s2 = str2+""+str1;
                return s1.compareTo(s2);
            }
        });
        for (int j : list)
            s +=j;
        return s;
    }
}
