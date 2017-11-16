package problem40;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class Solution40 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        if (input == null || k > input.length || input.length <= 0 || k <= 0)
            return result;
        TreeSet<Integer> temp = new TreeSet<>();
        for (int i = 0; i < input.length; i++) {
            if (temp.size() < k)
                temp.add(input[i]);
            else {
                if (temp.last() > input[i]) {
                    temp.remove(temp.last());
                    temp.add(input[i]);
                }
            }
        }
        Iterator<Integer> index =temp.iterator();
        while (index.hasNext()){
            result.add(index.next());
        }
        return result;
    }
}
