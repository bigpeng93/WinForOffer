package problem17;

public class Solution17 {
    public void PrintToMax(int n){
        if (n<=0){
            return;
        }
        char[] number =new char[n];
        for(int i=0;i<n;i++){
            number[i]='0';
        }
        while (!Increament(number)){
            PrintNumber(number);
        }

    }

    private boolean Increament(char[] number){
        boolean isOverflow = false;
        int nTakeOver = 0;
        int nLength = number.length;
        for (int i = nLength-1;i>=0;i--){
            int nSum = number[i] -'0'+nTakeOver;
            //System.out.println(nSum);
            if(i == nLength-1)
                nSum ++;
            if(nSum>=10){
                if(i==0)
                    isOverflow = true;
                else {
                    nSum-=10;
                    nTakeOver = 1;
                    number[i] =(char) ('0' + nSum);
                }
            }else {
                number[i] = (char) ('0' + nSum);
                break;
            }
        }
        return isOverflow;
    }
    public void PrintNumber(char[] number){
        boolean isBeginning = true;
        int nLength = number.length;
        //System.out.println(number[nLength-2]+' '+number[nLength-1]);
        for(int i=0;i<nLength;++i){
            if(isBeginning && number[i]!=0){
                isBeginning = false;
            }
            //System.out.println(isBeginning);
            if(!isBeginning){
                System.out.print(number[i]);
            }
        }
        System.out.println();
    }
}
