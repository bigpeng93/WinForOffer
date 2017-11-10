package problem10;

public class SolutionJumpFloor2 {
    public int JumpFloor2(int target){
        if(target<=0){
            return 0;
        }
        return 1<<(target-1);
    }
}
