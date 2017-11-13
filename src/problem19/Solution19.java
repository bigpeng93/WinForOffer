package problem19;

public class Solution19 {
    public boolean match(char[] str,char[] pattern){
        if(str == null || pattern == null){
            return false;
        }
        int strindex = 0;
        int patternindex =0;
        return matchcore(str,strindex,pattern,patternindex);
    }
    public boolean matchcore(char[] str,int strindex , char[] pattern, int patternindex){
        if(strindex == str.length && patternindex == pattern.length){
            return true;
        }
        if(strindex != str.length && patternindex == pattern.length){
            return false;
        }
        if(strindex == str.length && patternindex != pattern.length){
            if(patternindex+1<pattern.length && pattern[patternindex+1] == '*'){
                return matchcore(str,strindex,pattern,patternindex+2);
            }
            return false;
        }
        if(patternindex+1<pattern.length && pattern[patternindex+1]=='*'){
            if(str[strindex] == pattern[patternindex] || pattern[patternindex]=='.'&& strindex != str.length){
                return matchcore(str,strindex,pattern,patternindex+2) ||
                        matchcore(str,strindex+1,pattern,patternindex+2) ||
                        matchcore(str,strindex+1,pattern,patternindex);
            }else{
                matchcore(str,strindex,pattern,patternindex+2);
            }
        }
        if(str[strindex] == pattern[patternindex] || pattern[patternindex]=='.'&& strindex != str.length){
            return matchcore(str,strindex+1,pattern,patternindex+1);
        }
        return false;
    }

}
