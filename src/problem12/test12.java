package problem12;

public class test12 {
    public static void main(String[] args) {
        char[] matrix = {'A','B','C','E','S','F','C','S','A','D','E','E'};
        int rows = 4;
        int cols = 3;
        char[] str = {'A','B','C','B'};
        PathInMatrix2 pathInMatrix2 = new PathInMatrix2();
        System.out.println(pathInMatrix2.hasPath(matrix, rows, cols, str));
        char[] str2={'A','B','C','C','E','D'};
        System.out.println(pathInMatrix2.hasPath(matrix,rows,cols,str2));
/*
        char[][] matrix ={{'a','b','t','g'},{'c','f','c','s'},{'j','d','e','h'}};
        String path = "abtg";
        PathInMatrix pathInMatrix = new PathInMatrix();
        System.out.println(pathInMatrix.containPath(path,matrix));*/
    }
}
