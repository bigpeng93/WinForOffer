package problem6;

import java.util.ArrayList;

public class test6 {
    public static void main(String[] args) {

        ListNode listNode = new ListNode(0);
        listNode.next=null;
        ListNode lastNode = listNode;
        for (int i = 1; i <= 10; i++) {
            ListNode temp = new ListNode(i);
            temp.next = null;
            lastNode.next = temp;
            lastNode = temp;
            System.out.println(listNode.next.val);
        }
        if(listNode!=null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }

        ReverseListNodeRecursively reverseListNode = new ReverseListNodeRecursively();
        ArrayList<Integer> list = reverseListNode.printListFromTailToHead(listNode);
        System.out.println(list.toString());
    }

}
