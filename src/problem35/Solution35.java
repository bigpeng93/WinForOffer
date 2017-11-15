package problem35;

public class Solution35 {
    public RandomListNode Clone(RandomListNode pHead){
        CloneNodes(pHead);
        ConnectRandomNodes(pHead);
        return ReconnectNodes(pHead);
    }

    private void CloneNodes(RandomListNode pHead){
        RandomListNode node = pHead;
        while (node !=null){
            RandomListNode CloneNode = new RandomListNode(node.label);
            CloneNode.next = node.next;
            CloneNode.random = null;

            node.next = CloneNode;
            node = CloneNode.next;

        }
    }
    private void ConnectRandomNodes(RandomListNode pHead){
        RandomListNode node  = pHead;
        while(node != null){
            RandomListNode CloneNode = node.next;
            if(node.random != null){
                CloneNode.random= node.random.next;
            }
            node = CloneNode.next;
        }
    }
    private RandomListNode ReconnectNodes(RandomListNode pHead){
        RandomListNode node = pHead;
        RandomListNode CloneHead = null;
        RandomListNode CloneNode = null;
        if(node != null){
            CloneHead = node.next;
            CloneNode = node.next;
            node.next = CloneNode.next;
            node = node.next;
        }
        while (node!=null){
            CloneNode.next = node.next;
            CloneNode = node.next;
            node.next = CloneNode.next;
            node = node.next;
        }
        return CloneHead;
    }

}
