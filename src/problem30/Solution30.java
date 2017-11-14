package problem30;

import java.util.Stack;

public class Solution30 {
    Stack<Integer> date = new Stack<>();
    Stack<Integer> min = new Stack<>();
    public void push(int node) {
        date.push(node);
        if(min.isEmpty()){
            min.push(node);
        }else{
            int top = min.peek();
            if(top > node){
                min.push(node);
            }else
                min.push(top);
        }
    }

    public void pop() {
        if(!date.isEmpty()){
            date.pop();
            min.pop();
        }

    }

    public int top() {
        return (int)date.peek();

    }

    public int min() {
        if(min.isEmpty())
            return 0;
        else
            return (int)min.peek();
    }
}
