package problem52;

public class Solution52 {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        int pHead1Length = GetListNodeLength(pHead1);
        int pHead2length = GetListNodeLength(pHead2);

        ListNode LongNode;
        ListNode ShortNode;
        int difLength ;

        if(pHead1Length>pHead2length){
            LongNode = pHead1;
            ShortNode = pHead2;
            difLength = pHead1Length-pHead2length;
        }else{
            LongNode = pHead2;
            ShortNode = pHead1;
            difLength = pHead2length-pHead1Length;
        }

        for(int i=0;i<difLength;i++){
            LongNode = LongNode.next;
        }
        while((LongNode != null) && (ShortNode!=null) && (LongNode!=ShortNode)){
            LongNode = LongNode.next;
            ShortNode = ShortNode.next;
        }
        return LongNode;
    }

    private int GetListNodeLength(ListNode listNode){
        int length=0;
        while (listNode != null){
            listNode = listNode.next;
            length++;
        }
        return length;
    }
}
