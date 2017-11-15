package problem31;

import problem9.Solution;

public class test31 {
    public static void main(String[] args) {
        Solution31 solution31 = new Solution31();
        int [] push = {1,2,3,4,5};
        int [] pop ={4,5,3,2,1};
        int [] pop1={4,3,5,1,2};
        System.out.println(solution31.IsPopOrder(push,pop));
        System.out.println(solution31.IsPopOrder(push,pop1));
    }
}
