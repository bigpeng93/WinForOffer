package problem12;

public class PathInMatrix {
    public boolean containPath(String path, char[][] matrix) {
        if(path == null || matrix == null){
            return false;
        }
        int row = matrix.length;
        int col = matrix[0].length;
        int pathLength = 0;
        boolean[][] visited = new boolean[row][col];

        for(int i = 0;i<row;i++){
            for (int j = 0; j<col;j++){
                if(contains(path,matrix,i,j,pathLength,visited)){
                    return  true;
                }
            }
        }
        return false;

    }
    private boolean contains(String path, char[][] matrix, int row, int col, int pathLenth, boolean[][] visited){
        boolean hashPath = false;
        if(pathLenth>=path.length()){
            return true;
        }
        if(row >=0 && row< matrix.length && col >=0 && col<matrix[0].length
                && matrix[row][col] == path.charAt(pathLenth) && !visited[row][col] ){
            visited[row][col] = true;
            System.out.println(matrix[row][col]);
            hashPath = contains(path,matrix,row,col-1,pathLenth+1,visited) ||
                    contains(path,matrix,row,col+1,pathLenth+1,visited) ||
                    contains(path,matrix,row-1,col,pathLenth+1,visited)||
                    contains(path,matrix,row+1,col,pathLenth+1,visited);
            if(!hashPath){
                visited[row][col]=false;
            }

        }
        return hashPath;
    }
}
