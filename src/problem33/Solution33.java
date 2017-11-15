package problem33;

public class Solution33 {
    public boolean VerifySquenceOfBST(int[]sequence){
        int start = 0;
        int end = sequence.length-1;
        return VerifySquenceOfBST(sequence,start,end);
    }

    public boolean VerifySquenceOfBST(int[] sequence,int start ,int end){
        if(sequence == null || start<0 || end<0)
            return false;
        int root = sequence[end];
        int i = start;
        for(;i<end;i++){
            if(sequence[i]>root)
                break;
        }


        for (int j =i;j<end;j++){
            if(sequence[j]<root)
                return false;
        }

        boolean left = true;
        if(i>start)
            left = VerifySquenceOfBST(sequence,start,i-1);

        boolean right= true;
        if(i<end)
            right = VerifySquenceOfBST(sequence,i,end-1);
        return (left&&right);
    }
}
