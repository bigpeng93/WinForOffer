package problem13;

public class Solution13 {
    public int movingcount(int threshold, int rows, int cols){
        if(threshold<0 || rows <=0 || cols <=0){
            return 0;
        }
        boolean[][] visited = new boolean[rows][cols];
        int count = countRange(threshold,0,0 ,rows,cols,visited);
        return count;
    }

    private int countRange(int threshold,int row,int col, int rows,int cols,boolean[][] visited){
        int count = 0;
        if (core(threshold,row,col,rows,cols,visited)){
            visited [row][col] = true;
            count = 1 + countRange(threshold,row-1,col,rows,cols,visited)+
                    countRange(threshold,row+1,col,rows,cols,visited)+
                    countRange(threshold,row,col-1,rows,cols,visited)+
                    countRange(threshold,row,col+1,rows,cols,visited);
        }
        return count;

    }
    private boolean core(int threshold,int row,int col, int rows,int cols,boolean[][] visited){
        if(row >= 0 && row < rows && col >=0 && col< cols
                && getDig(row)+getDig(col) <= threshold && !visited[row][col]){
            return true;
        }
        return false;
    }

    private int getDig(int numble){
        int sum = 0;
        while (numble>0){
            sum += numble%10;
            numble /= 10;
        }
        return sum;
    }
}
