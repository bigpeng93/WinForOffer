package problem11;

public class Solution11_2 {
    public int minNumberInRotateArray(int [] array) {
        if(array ==null){
            return 0;
        }
        if(array.length==1){
            return array[0];
        }
        for (int i=0;i<array.length-1;i++){
            if(array[i]>array[i+1])
                return array[i+1];
        }
        return array[0];
    }
}
