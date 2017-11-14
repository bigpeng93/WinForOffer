package problem15;

public class BitNumber {
    public int NumberOfOne(int n){
        int count = 0;
        int bit = 1;
        while (bit!=0){
            if((bit&n)!=0)
                count ++;
            bit = bit << 1;
        }
        return count;
   }
    /*public  int NumberOfTwo(int n){
        int
    }*/
}
