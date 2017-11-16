package problem38;

public class Solution38Two {
    public void combination(char[] chars) {
        char[] subchars = new char[chars.length];
        if(chars == null)
            return;
        for (int i = 0;i<chars.length;i++){
            int num = i+1;
            combination(chars,chars.length,num,subchars,num);
        }
    }

    public void combination(char[] chars,int length,int num,char[] subchars,int m){
        if(num == 0){
            for (int i =0;i<m;i++){
                System.out.print(subchars[i]);
            }
            System.out.println();
        }else {

            for (int i = length; i >= num; i--) {
                //System.out.println(chars[i-1]);
                subchars[num - 1] = chars[i - 1];
                combination(chars, i - 1, num - 1, subchars, m);
            }
        }
    }
}
