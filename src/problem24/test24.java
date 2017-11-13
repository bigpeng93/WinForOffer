package problem24;

public class test24 {
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
        Solution24 solution24 = new Solution24();
        ListNode HeadNode = solution24.ReverseList(listNode);
        for(int i=0;i<10;i++){
            System.out.println(HeadNode.value);
            HeadNode = HeadNode.next;
        }
    }
}
