package problem6;

import java.util.ArrayList;

public class ReverseListNodeRecursively {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode){
        if(listNode ==null){
            ArrayList<Integer> list = new ArrayList<>();
            return list;
        }
        ArrayList<Integer> arr =new ArrayList<>();
        if(listNode!=null){
            if(listNode.next!=null){
                printListFromTailToHead(listNode.next);
            }else
                arr.add(listNode.val);
        }
        return arr;

    }
}
