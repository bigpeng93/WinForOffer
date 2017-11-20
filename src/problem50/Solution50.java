package problem50;

public class Solution50 {
    public int FirstNotRepeatingChar(String str) {
        if (str.length()==0)
            return -1;
        int[] time = new int[256];
        for(int i=0;i<str.length();i++){
            time[str.charAt(i)]++;
        }
        for(int i=0;i<str.length();i++)
            if(time[str.charAt(i)]==1)
                return i;
        return 0;
    }
}
