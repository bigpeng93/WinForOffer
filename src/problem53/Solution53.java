package problem53;

public class Solution53 {
    public int GetNumberOfK(int [] array , int k) {
        int mid = array.length/2;
        if(k<array[0] || k>array[array.length-1])
            return 0;
        int start = GetStartOfNum(array,k);
        int end = GetEndOfNum(array,k);
        return end-start+1;

    }
    private int GetStartOfNum(int[] array,int k){
        int left = 0;
        int right = array.length-1;
        int mid;
        while (left<=right){
            if(left == right){
                //System.out.println(array[left]);
                if(array[left] == k)
                    return left;
                else
                    return -1;
            }
            mid = (left+right)/2;
            if(array[mid] > k)
                right = mid-1;
            else if(array[mid] < k)
                left = mid+1;
            else
                right = mid;
        }
        return -1;
    }
    private int GetEndOfNum(int[] array,int k){
        int left = 0;
        int right = array.length-1;
        int mid;
        while (left<=right){
            if(left == right){
                if(array[left] == k)
                    return left;
                else
                    return -1;
            }
            mid = (left+right)/2;
            if(array[mid] > k)
                right = mid-1;
            else if(array[mid] < k)
                 left = mid+1;
            else
                left = mid;
        }
        return -1;
    }
    public int GetNumberOfKTwo(int [] array , int k) {
        if(array.length==0 ||k<array[0] || k>array[array.length-1])
            return 0;
        int count = 0;
        for(int i=0;i<array.length;i++){
            if(array[i] == k)
                count ++;
        }
        return count;
    }
}

