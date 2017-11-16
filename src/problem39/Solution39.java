package problem39;

public class Solution39 {
    public int MoreThanHalfNum_Solution(int [] array) {
        if(array == null|| array.length<=0){
            return 0;
        }

        int result = array[0];
        int count = 1;
        for(int i=1;i<array.length;i++){
            if(result == array[i])
                count++;
            else if(count >0){
                count--;
            }else if(count == 0) {
                result = array[i];
                count = 1;
            }
        }

        for (int i = 0;i<array.length;i++){
            if(array[i] == result)
                count ++;
        }
        return count > (array.length/2 ) ?result:0;
    }
}
