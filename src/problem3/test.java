package problem3;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int num[]={1,3,1,0,4,5,3};
        int length = num.length;
        FindArrayReppeat findArrayReppeat = new FindArrayReppeat();
        findArrayReppeat.findRepeat(num,length);
        System.out.println(findArrayReppeat.findRepeat(num,length));

    }
}
