package problem4;

public class test {
    public static void main(String[] args) {
        int num[][]={{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        FindArray findArray=new FindArray();
        System.out.println(findArray.find(num,1));
    }
}