package problem19;

public class test19 {
    public static void main(String[] args) {
        Solution19 solution19 = new Solution19();
        char[] str ={'a','a','a'};
        char[] pattern ={'a','b','*','a','c','*','a'};
        char[] pattern2 = {'a','a','.','a'};
        System.out.println(solution19.match(str,pattern));
        System.out.println(solution19.match(str,pattern2));

    }
}
