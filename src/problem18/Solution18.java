package problem18;

public class Solution18 {
    public void DeleteNode(ListNode head,ListNode tobeDelete){
        if(head == null || tobeDelete ==null){
            return;
        }
        if(tobeDelete.next!=null){
            tobeDelete.val = tobeDelete.next.val;
            tobeDelete.next = tobeDelete.next.next;
        }else if(head.next == null){
            head =null;
        }else {
            ListNode temp = head.next;
            while (temp !=null){
                if(temp.next == tobeDelete){
                    temp.next = tobeDelete.next.next;
                    break;
                }
                temp = temp.next;
            }
        }
    }
}
