package problem4;

public class FindArray {
    public boolean find(int[][] num,int number){
        int row =0;
        int col=num[row].length-1;
            while (row<num.length && col >=0 ){
                if(num[row][col]==number){
                    return true;
                }
                else if (num[row][col]>number){
                    col--;
                }else
                    row++;
            }
            return false;
    }
}
