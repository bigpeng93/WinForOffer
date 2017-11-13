package problem21;

import java.util.Arrays;

public class Solution21 {
    public void reOrderArray(int[] array) {
/*        int HeadIndex = 0;
        int LastIndex = array.length-1;
        if(array == null){
            return;
        }
        while(HeadIndex <LastIndex){
            while (HeadIndex < LastIndex && (array[HeadIndex] & 1)!=0){
                HeadIndex++;
            }
            while (HeadIndex <LastIndex && (array[LastIndex] & 1) == 0){
                LastIndex--;
            }
            if(HeadIndex < LastIndex){
                int temp = array[HeadIndex];
                array[HeadIndex] = array[LastIndex];
                array[LastIndex] = temp;
                HeadIndex++;
                LastIndex--;
            }
        }*/
        if(array == null){
            return;
        }
        for(int i = 0;i<array.length-1;i++){
            for (int j=0;j<array.length-1-i;j++){
                if(array[j]%2==0&&array[j+1]%2==1){
                    int t = array[j];
                    array[j]=array[j+1];
                    array[j+1]=t;
                }
            }
        }
    }
}
