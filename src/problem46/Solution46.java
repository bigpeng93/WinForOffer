package problem46;

public class Solution46 {
    public int translateCount(int number){
        if(number<0)
            return 0;
        if(number == 1)
            return 1;
        return translateCount(Integer.toString(number));
    }
    private int translateCount(String number){
        int f1=0;
        int f2=1;
        int g=0;
        int temp;
        for(int i=number.length()-2;i>=0;i--){
            if((Integer.valueOf(number.charAt(i)+""+number.charAt(i+1)) )<26)
                g=1;
            else g=0;
            temp = f2;
            f2 = f2+g*f1;
            f1=temp;
        }
        return f2;
    }
}
