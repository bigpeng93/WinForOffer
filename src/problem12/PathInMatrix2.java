package problem12;

/**
 * 大bug
 *
 */
public class PathInMatrix2 {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str){
        if(matrix.length<1 || rows <0 || cols<0 || str ==null){
            return false;
        }
        boolean[] visited = new boolean[rows * cols];
        for (int i = 0 ;i < rows * cols; i++){
            visited[i] = false;
        }
        int pathLength = 0;
        for (int i = 0;i<rows;i++){
            for (int j=0;j<cols;j++){
                if(contains(matrix,rows,cols,i,j,pathLength,str,visited))
                    return true;
            }
        }
        return false;
    }
    private boolean contains(char[] matrix,int rows, int cols,int i,int j,int pathLength,char[] str,boolean[] visited){
        boolean hashpath = false;
        if(pathLength >= str.length-1){
            return true;
        }
        if(i>=0 && i<rows && j>=0&& j<cols && matrix[i*cols+j] == str[pathLength] && (!visited[i*cols+j])){
            visited[i*cols + j] = true;
            hashpath = contains(matrix,rows,cols,i-1,j,pathLength+1,str,visited)||
                    contains(matrix,rows,cols,i+1,j,pathLength+1,str,visited) ||
                    contains(matrix,rows,cols,i,j-1,pathLength+1,str,visited)||
                    contains(matrix,rows,cols,i,j+1,pathLength+1,str,visited);

            if(!hashpath){
                visited[i*cols+j] = false;
            };
        }
        return hashpath;
    }
}
