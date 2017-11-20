package problem47;

public class Solution47 {
    public int getMaxValue(int[][] values){
        int row = values.length;
        int col = values[0].length;

        if(values.length==0 || values[0].length==0)
            return 0;
        int[][] dp = new int[row][col];
        int count=values[0][0];
        return getMaxValue(values,row,0,col,0,count);
    }
    private int getMaxValue(int[][] values ,int row,int rowindex,int col,int colindex,int count){
        if(colindex == col-1 && rowindex == row-1){
            return count;
        }
        if(((rowindex+1)<=row-1&&(colindex+1)<=col-1 && values[rowindex+1][colindex] > values[rowindex][colindex+1]) || (colindex == col-1)){
            System.out.println(values[rowindex+1][colindex]);
            return getMaxValue(values,row,rowindex+1,col,colindex,count+values[rowindex+1][colindex]);
        }
        if(((rowindex+1)<=row-1&&(colindex+1)<=col-1 && values[rowindex][colindex+1] > values[rowindex+1][colindex]) || (rowindex == row-1)){
            System.out.println(values[rowindex][colindex+1]);
            return getMaxValue(values,row,rowindex,col,colindex+1,count+values[rowindex][colindex]);
        }
        return count;
    }
}
