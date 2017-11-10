package problem6;

import java.util.ArrayList;
import java.util.Stack;

public class ReverseListNode {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode){
        if(listNode == null){
            ArrayList<Integer> list = new ArrayList<>();
            return list;
        }
        Stack<Integer> stack = new Stack<>();
        while(listNode!=null){
            stack.push(listNode.val);
            System.out.println(listNode.val);
            listNode=listNode.next;

        }
        System.out.println(stack.size());
        ArrayList<Integer> list = new ArrayList<>();
        while (!stack.isEmpty()){
            list.add(stack.pop());
        }
        System.out.println(list.size());
        System.out.println(list.toString());
        return list;
    }
}
