package problem22;

public class test22 {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(0);
        listNode.next=null;
        ListNode lastNode = listNode;
        for (int i = 1; i <= 10; i++) {
            ListNode temp = new ListNode(i);
            temp.next = null;
            lastNode.next = temp;
            lastNode = temp;
        }
        Solution22 solution22 = new Solution22();
        System.out.println(solution22.FindKthToTail(listNode,2).value);
    }
}
