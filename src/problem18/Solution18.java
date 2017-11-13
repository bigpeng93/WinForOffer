package problem18;

public class Solution18 {
    public void DeleteNode(ListNode head,ListNode tobeDelete){
        if(head == null || tobeDelete ==null){
            return;
        }
        if(tobeDelete.Next!=null){
            tobeDelete.value = tobeDelete.Next.value;
            tobeDelete.Next = tobeDelete.Next.Next;
        }else if(head.Next == null){
            head =null;
        }else {
            ListNode temp = head.Next;
            while (temp !=null){
                if(temp.Next == tobeDelete){
                    temp.Next = tobeDelete.Next.Next;
                    break;
                }
                temp = temp.Next;
            }
        }
    }
}
