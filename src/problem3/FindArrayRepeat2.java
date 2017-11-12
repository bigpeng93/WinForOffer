package problem3;

public class FindArrayRepeat2 {
    public int findrepeat(int num[],int length){
        if (num == null || length==0){

            return -1;
        }
        int start = 1;
        int end = length-1;

        while (end >= start){
            int middle = ((end-start)>>1)+start;
            int count = countRange(num,length,start,middle);
            if (end == start){
                if (count > 1)
                    return start;
                else break;
            }
            if (count >(middle-start+1))
                end = middle;
            else start=middle+1;
        }
        return -1;
    }

    private int countRange(int[] number ,int length ,int start, int end){
        if(number == null){
            return 0;
        }
        int count = 0;
        for(int i = 0; i<length;i++){
            if (number[i]>=start && number[i]<=end){
                ++count;
            }
        }
        return count;
    }
}
