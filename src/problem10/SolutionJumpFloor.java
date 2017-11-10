package problem10;

public class SolutionJumpFloor {
    public int JumpFloor(int target){
        int fibPreNum = 2;
        int fibprePreNum = 1;
        int fibNum = 0;

        int[] result = {0,1,2};
        if(target<3){
            return result[target];
        }

        for(int i = 3; i<=target;i++){
            fibNum = fibPreNum+fibprePreNum;
            fibprePreNum = fibPreNum;
            fibPreNum = fibNum;
        }
        return fibNum;
    }
}
