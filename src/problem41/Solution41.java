package problem41;

import java.util.LinkedList;

public class Solution41 {
    LinkedList<Integer> list = new LinkedList<Integer>();
    public void Insert(Integer num) {
        if(list.size() ==0 || num<list.getFirst())
            list.addFirst(num);
        else{
            boolean flag = false;
            for(Integer e : list){
                if(num < e){
                    int index = list.indexOf(e);
                    list.add(index,num);
                    flag = true;
                    break;
                }
            }
            if(!flag)
                list.addLast(num);

        }
    }

    public Double GetMedian() {
        if(list.size()==0)
            return null;
        if((list.size()&1) == 0){
            int i = list.size()/2;
            Double result = Double.valueOf(list.get(i-1)+list.get(i));
            return result/2;
        }
        Double aDouble = Double.valueOf(list.get((list.size()+1)/2-1));
        return aDouble;
    }
}
