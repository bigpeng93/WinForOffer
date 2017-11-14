package problem30;

public class test30 {
    public static void main(String[] args) {
        Solution30 solution30 = new Solution30();
        for(int i = 1;i<10;i++){
            solution30.push(i);
        }
        System.out.println(solution30.min);
    }
}
