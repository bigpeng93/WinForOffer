package problem25;

public class Solution25 {
    public ListNode Merge(ListNode HeadOne ,ListNode HeadTwo){
        if(HeadOne == null)
            return HeadTwo;
        else if (HeadTwo == null)
            return HeadOne;

        ListNode MergeHead = null;

        if(HeadOne.value < HeadTwo.value){
            MergeHead = HeadOne;
            MergeHead.next = Merge(HeadOne.next,HeadTwo);
        }else {
            MergeHead = HeadTwo;
            MergeHead.next = Merge(HeadOne,HeadTwo.next);

        }
        return MergeHead;
    }
}
