package problem3;

import java.util.Arrays;

public class FindArrayReppeat{
    public static int findRepeat(int num[],int length){
        if(num == null || length ==0){
            return -1;
        }
        for (int i=0;i<length;i++){
            if(num[i]<0||num[i]>length-1){
                return -1;
            }
        }
        for(int i=0; i<length;i++){
            while (num[i]!=i){
                if(num[i]==num[num[i]]){
                    int number =num[i];
                    System.out.println(number);
                    break;
                }
                int temp=num[i];
                num[i]=num[temp];
                num[temp]=temp;
            }
        }
        return -1;
    }

}
