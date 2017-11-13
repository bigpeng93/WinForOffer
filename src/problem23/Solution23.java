package problem23;

public class Solution23 {
    public ListNode EntryNodeOfLoop(ListNode HeadNode){
        if(HeadNode == null)
            return null;
        ListNode meetingNode = MeetingNode(HeadNode);
        int nodesInLoop = 1;
        ListNode NodeOne = meetingNode;
        while(NodeOne.next != meetingNode){
            NodeOne = NodeOne.next;
            nodesInLoop ++;
        }
        NodeOne = HeadNode;
        for(int i=0;i<nodesInLoop;i++){
            NodeOne= NodeOne.next;
        }
        ListNode NodeTwo = HeadNode;
        while(NodeOne == NodeTwo){
            NodeOne = NodeOne.next;
            NodeTwo = NodeTwo.next;
        }
        return NodeOne;
    }


    private ListNode MeetingNode(ListNode HeadNode){
        if(HeadNode == null)
            return null;
        ListNode SlowNode = HeadNode.next;
        if(SlowNode == null)
            return null;
        ListNode FastNode  = SlowNode.next;
        while (SlowNode !=null && FastNode !=null){
            if(SlowNode == FastNode)
                return FastNode;
            SlowNode = SlowNode.next;
            FastNode = FastNode.next.next;
        }
        return null;
    }
}
