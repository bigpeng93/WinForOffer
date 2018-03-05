package problem18;

public class test18 {
    public static void main(String[] args) {
        DeleteRepNode deleteRepNode = new DeleteRepNode();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(5);
        deleteRepNode.DeleteDuplication(head);
        while (head!=null){
            System.out.println(head.val);
            head= head.next;
        }
    }
}
