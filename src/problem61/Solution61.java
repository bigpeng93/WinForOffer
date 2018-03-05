package problem61;

import java.util.Arrays;

public class Solution61 {
    public boolean isContinuous(int [] numbers) {
        if(numbers.length<=0)
            return false;
        Arrays.sort(numbers);
        int zero = 0,i=0;
        for(;i<numbers.length&&numbers[i]==0;i++){
            zero++;
        }
        for(;i<numbers.length-1 && zero>=0;i++){
            if(numbers[i]==numbers[i+1])
                return false;
            else if(numbers[i]+zero+1>=numbers[i+1])
                zero -= numbers[i+1]-numbers[i]-1;
            else
                return false;
        }
        if(i==numbers.length-1)
            return true;
        else
            return false;
    }
}
