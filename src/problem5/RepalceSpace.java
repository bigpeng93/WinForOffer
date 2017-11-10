package problem5;

public class RepalceSpace {
    public String repalce(StringBuffer str) {
        StringBuffer buffer = new StringBuffer();
        for(int i=0,j=0; i<=str.length()-1;i++,j++){
            if(str.charAt(i)==' '){
                buffer.insert(j++,"%");
                buffer.insert(j++,"2");
                buffer.insert(j,"0");
            }else
                buffer.append(str.charAt(i));
        }
        return buffer.toString();
    }

}
