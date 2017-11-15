package problem31;

import java.util.Stack;

public class Solution31 {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> date = new Stack<>();
        if(pushA == null || popA == null)
            return false;
        int popIndex = 0;
        for(int i=0;i<pushA.length;i++){
            date.push(pushA[i]);
            while (!date.isEmpty() && date.peek()==popA[popIndex]){
                date.pop();
                popIndex++;
            }
        }
        return date.isEmpty();
    }
}
