package problem49;

public class Solution49 {
    public int GetUglyNumber_Solution(int index) {
        if(index <=0)
            return 0;
        int[] number = new int[index];
        number[0] =1;
        int NumIndex=0;
        int NumIndex2 = 0;
        int NumIndex3 = 0;
        int NumIndex5 = 0;
        while (NumIndex+1<index){
            number[++NumIndex]=min(number[NumIndex2]*2,number[NumIndex3]*3,number[NumIndex5]*5);
            if(number[NumIndex2]*2 == number[NumIndex])
                NumIndex2++;
            if(number[NumIndex3]*3 == number[NumIndex])
                NumIndex3++;
            if(number[NumIndex5]*5 == number[NumIndex])
                NumIndex5++;
        }
        return number[index-1];
    }
    private int min(int num1,int num2,int num3){
        int temp = num1<=num2?num1:num2;
        return temp<=num3?temp:num3;
    }
}
