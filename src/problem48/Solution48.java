package problem48;

public class Solution48 {
    public int longestSubstringWithoutDup(String str){
        if(str.isEmpty() || str.length() ==0){
            return 0;
        }
        int[] dp = new int[str.length()];
        dp[0] =1;
        int max=0;
        for(int i =1;i<str.length();i++){

            if(str.charAt(i)<=str.charAt(i-1)){
                //System.out.println(str.charAt(i));
                dp[i]=1;
            }else {
                dp[i] = dp[i-1]+1;
                if(max<dp[i])
                    max = dp[i];
            }
            System.out.println(dp[i]);
        }
        return max;
    }
}
