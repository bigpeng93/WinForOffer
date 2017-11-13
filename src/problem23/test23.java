package problem23;

public class test23 {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(0);
        listNode.next=null;
        ListNode lastNode = listNode;
        for (int i = 1; i < 10; i++) {
            ListNode temp = new ListNode(i);
            temp.next = null;
            lastNode.next = temp;
            lastNode = temp;
        }
        lastNode.next = listNode.next.next.next;
        System.out.println(lastNode.next.value);
        Solution23 solution23 = new Solution23();
        System.out.println(solution23.EntryNodeOfLoop(listNode).value);

    }
}
