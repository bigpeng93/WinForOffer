package problem58;

import java.util.Arrays;

public class Solution58 {
    public String LeftRotateString(String str,int n) {
        if(str.length()<=0 || n<0)
            return "";
        StringBuffer stringBuffer1= new StringBuffer(str.substring(0,n));
        StringBuffer stringBuffer2 = new StringBuffer(str.substring(n,str.length()));
        stringBuffer2.append(stringBuffer1);
        return stringBuffer2.toString();
    }

    public String ReverseSentence(String str) {
        if(str.length()==0)
            return "";
        if(str.trim().equals(""))
            return str;
        String [] strs = str.split(" ");
        StringBuffer stringBuffer = new StringBuffer();
        for(int i=strs.length-1;i>=0;i--){
            if(i==0){
                stringBuffer.append(strs[i]);
            }else{
                stringBuffer.append(strs[i]);
                stringBuffer.append(" ");
            }
        }
        return stringBuffer.toString();
    }
}
