package problem10;

public class Solution10 {
    public int Fibonacci(int n) {
        int fibPreNum = 1;
        int fibprePreNum = 0;
        int fibNum = 0;

        int[] result = {0,1,2};
        if(n<3){
            return result[n];
        }

        for(int i = 3; i<=n;i++){
            fibNum = fibPreNum+fibprePreNum;
            fibprePreNum = fibPreNum;
            fibPreNum = fibNum;
        }
        return fibNum;
    }
}
