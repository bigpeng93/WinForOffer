package problem18;

public class DeleteRepNode {
    public ListNode DeleteDuplication(ListNode head){
        if(head == null){
            return null;
        }
        ListNode node = head;
        ListNode first = new ListNode(0);
        first.next=head;
        ListNode pre= first;
        while (node !=null){
            ListNode prenode = node.next;
            if(prenode == null)
                break;
            if(node.val == prenode.val){
                while(prenode!=null && node.val == prenode.val)
                    prenode = prenode.next;
                pre.next = prenode;
                node = prenode;
            }else{
                pre = node;
                prenode = prenode.next;
                node = node.next;
            }
        }
        return first.next;
    }

}
