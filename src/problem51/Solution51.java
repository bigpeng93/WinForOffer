package problem51;

public class Solution51 {
    public int InversePairs(int [] array) {
        if(array.length ==0 || array ==null)
            return 0;
        int[] copy = new int[array.length];
        for(int i=0;i<array.length;i++){
            copy[i] = array[i];
        }
        return InverseParisCore(array,copy,0,array.length-1);

    }
    private int InverseParisCore(int [] array,int[] copy,int start,int end){
        if(start == end){
            copy[start] = array[start];
            return 0;
        }

        int length = (end-start)/2;
        int left = InverseParisCore(array,copy,start,start+length)%1000000007;
        int right=InverseParisCore(array,copy,start+length+1,end)%1000000007;

        int copyindex = end;    //定义copy数组的索引
        int i = start+length;   //指向左数组的末尾
        int j = end;            //指向右数组的末尾
        int count = 0;
        while (i>=start && j>= start+length+1){
            if (array[i]>array[j]){
                copy[copyindex--] = array[i--];
                count += j-start-length;
                if(count > 1000000007)
                    count %= 1000000007;
            }else{
                copy[copyindex--] = array[j--];
            }
        }

        for(;i>=start;--i)
            copy[copyindex--] = array[i--];
        for (;j>=start+length+1;--j)
            copy[copyindex--] = array[j--];
        return (left+right+count)%1000000007;

    }
}
