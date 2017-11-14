package problem29;

import java.util.ArrayList;

public class test29 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        Solution29 solution29 = new Solution29();
        ArrayList<Integer> arrayList = solution29.printMatrix(matrix);
        System.out.println(arrayList.toString());
    }
}
