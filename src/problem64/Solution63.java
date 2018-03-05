package problem64;

public class Solution63 {
    public int Sum_Solution(int n) {
        if(n<=0)
            return 0;
        int sum =(int)Math.pow(n,2)+n;
        return sum>>1;
    }
}
