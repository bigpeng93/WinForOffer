package problem57;

import java.util.ArrayList;

public class Solution57 {
    public ArrayList<Integer> FindNumberWithSum(int data[],int sum){
        if(data == null || sum ==1)
            return null;
        int head = 0;
        int last= data.length-1;
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (head<last){
            if(data[head]+data[last]>sum){
                last--;
            }else if(data[head]+data[last]<sum){
                head++;
            }else{
                list.add(data[head]);
                list.add(data[last]);
                return list;
            }
        }
        return list;
    }

    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>();
        if(sum == 1)
            return lists;
        int head =2;
        int last =1;
        while (last < (1+sum)/2){
            int tempSum = SumofList(head,last);
            if(tempSum == sum){
                ArrayList<Integer> list = new ArrayList<Integer>();
                for(int i=last;i<=head;i++){
                    list.add(i);
                }
                lists.add(list);
                last+=2;
                head++;
            }else if(tempSum<sum)
                head++;
            else
                last++;
        }
        return lists;
    }
    private int SumofList(int head ,int last){
        int sum = last;
        for(int i= last+1;i<=head;i++){
            sum+=i;
        }
        return sum;
    }
}
