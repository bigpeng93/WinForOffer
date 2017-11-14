package problem29;

import java.util.ArrayList;

public class Solution29 {
    public ArrayList<Integer> printMatrix(int[][] matrix) {
        if(matrix == null)
            return null;
        int start = 0;
        int row = matrix.length;
        int col = matrix[0].length;
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (col > start*2 && row >start*2){
            int endX=col-1-start;
            int endY = row-1-start;
            //从左到右打印一行
            for(int i = start;i<=endX;i++){
                arrayList.add(matrix[start][i]);
               // System.out.println(matrix[start][i]);
            }
            //从上到下打印一列
            if(start<endY){
                for(int i = start+1;i<=endY;i++){
                    arrayList.add(matrix[i][endX]);
                    //System.out.println(matrix[start+1][endX]);
                }
            }
            //从左到右打印一行
            if(start<endX && start<endY){
                for(int i = endX-1;i>=start;i--){
                    arrayList.add(matrix[endY][i]);
                    //System.out.println(matrix[endY][i]);
                }
            }
            //从下到上打印一列
            if(start<endX&&start<endY){
                for(int i=endY-1;i>=start+1;i--){
                    arrayList.add(matrix[i][start]);
                    //System.out.println(matrix[i][start]);
                }
            }
            start++;
        }
        return arrayList;
    }

}
