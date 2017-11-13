package problem20;

public class Solution20 {
    static int strindex =0;
    public boolean isNumberric(char[] str){
        if(str == null){
            return false;
        }

        boolean numeric = scanInteger(str);
        if(strindex<str.length && str[strindex] == '.'){
            strindex ++;
            numeric = scanUndsignedInteger(str) || numeric;
        }
        if (strindex<str.length && (str[strindex]=='e'||str[strindex]=='E')){
            strindex++;
            numeric = numeric && scanInteger(str);
        }
        return numeric;

    }
    private boolean scanInteger(char[] str){
        if(strindex<str.length && (str[strindex] == '+' || str[strindex]=='-')){
            strindex++;
        }
        return scanUndsignedInteger(str);
    }
    private boolean scanUndsignedInteger(char[] str){
        int before = 0;
        while (strindex<str.length && str[strindex] >= '0' && str[strindex]<='9'){
            before++;
            strindex++;
        }
        return (before>0);
    }
}
