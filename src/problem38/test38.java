package problem38;

public class test38 {
    public static void main(String[] args) {
/*        String str="abc";
        Solution38One solution38One = new Solution38One();
        System.out.println(solution38One.Permutation(str).toString());*/
        char[] num = new char[]{'a','b','c','d','e'};
        //System.out.println(num);
        Solution38Two solution38Two = new Solution38Two();
        solution38Two.combination(num);
    }
}
