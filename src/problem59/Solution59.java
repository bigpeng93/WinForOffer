package problem59;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class Solution59 {
    public ArrayList<Integer> maxInWindows(int [] num, int size){
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(num.length==0 || size <=0 || size > num.length)
            return result;

        //用来存放数字的原数组中的索引
        ArrayDeque<Integer> deque = new ArrayDeque<Integer>();

        for (int i=0;i<size-1;i++){
            while (!deque.isEmpty()&&num[i] >= num[deque.getLast()])
                deque.removeLast();
            deque.addLast(i);
        }
        for(int i=size-1;i<num.length;i++){
            while(!deque.isEmpty() && num[i]>num[deque.getLast()])
                deque.removeLast();
            if (!deque.isEmpty() && i-deque.getFirst()+1>size)
                deque.removeFirst();
            deque.addLast(i);
            result.add(num[deque.getFirst()]);
        }
        return result;
    }
}
