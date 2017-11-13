package problem24;

public class Solution24 {
    public ListNode ReverseList(ListNode HeadNode){
        if(HeadNode == null){
            return null;
        }
        ListNode ReverseHead = null;
        ListNode Node = HeadNode;
        ListNode Prev = null;
        while (Node != null){
            ListNode next = Node.next;
            if(next == null)
                ReverseHead = Node;
            Node.next = Prev;
            Prev = Node;
            Node = next;
        }
        return ReverseHead;
    }
}
