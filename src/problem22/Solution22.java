package problem22;

public class Solution22 {
    public ListNode FindKthToTail(ListNode Head,int k){
        if(Head == null || k ==0){
            return null;
        }
        ListNode OneList = Head;
        ListNode TwoList = null;
        for(int i=0;i<k-1;i++){
            if(OneList.next != null){
                OneList = OneList.next;
            }else return null;
        }
        TwoList = Head;
        while (OneList.next!=null){
            OneList = OneList.next;
            TwoList = TwoList.next;
        }
        return TwoList;

    }
}
