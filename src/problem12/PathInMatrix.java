package problem12;

public class PathInMatrix {
    public boolean containPath(String path, char[][] matrix) {
        if(path == null || matrix == null){
            return false;
        }
        return true;
    }
    private boolean contains(String path, char[][] matrix, int row, int col, int pathLenth, boolean[][] visited){
        boolean hashPath = false;
        if(row > 0 && row< matrix.length && col >0 && col<matrix[0].length
                && matrix[row][col] == path.charAt(pathLenth)&& !visited[row][col]){
        return true;
        }
        return true;
    }
}
