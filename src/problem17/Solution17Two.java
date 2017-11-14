package problem17;

import problem12.PathInMatrix;

public class Solution17Two {
    public void PrintMax(int n){
        if(n<=0)
            return;
        char[] number = new char[n];
        for(int i = 0;i<10;i++){
            number[0] = (char) (i+'0');
            PrintToMax(number,n,0);
        }
    }
    public void PrintToMax(char[] number,int length,int index){
        if(index == length-1){
            PrintNumber(number);
            return;
        }
        for(int i=0;i<10;i++){
            number[index+1]=(char)(i+'0');
            PrintToMax(number,length,index+1);
        }
    }
    public void PrintNumber(char[] number){
        boolean isBeginning = true;
        int nLength = number.length;
        for(int i=0;i<nLength;++i){
            if(isBeginning && number[i]!=0){
                isBeginning = false;
            }
            if(!isBeginning){
                System.out.print(number[i]);
            }
        }
        System.out.println();
    }
}
