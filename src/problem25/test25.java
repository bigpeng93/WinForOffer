package problem25;

public class test25 {
    public static void main(String[] args) {
        ListNode listNodeOne = new ListNode(1);
        listNodeOne.next=null;
        ListNode lastNodeOne = listNodeOne;
        for (int i = 3; i < 10; i=i+2) {
            ListNode temp = new ListNode(i);
            temp.next = null;
            lastNodeOne.next = temp;
            lastNodeOne = temp;
        }
        ListNode listNodeTwo = new ListNode(2);
        listNodeTwo.next=null;
        ListNode lastNodeTwo = listNodeTwo;
        for (int i = 4; i < 10; i=i+2) {
            ListNode temp = new ListNode(i);
            temp.next = null;
            lastNodeTwo.next = temp;
            lastNodeTwo = temp;
        }
        Solution25 solution25 = new Solution25();
        ListNode NewHead = solution25.Merge(listNodeOne,listNodeTwo);
        for(int i =1;i<10;i++){
            System.out.println(NewHead.value);
            NewHead = NewHead.next;
        }
    }
}
