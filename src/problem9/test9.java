package problem9;

public class test9 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        for(int i = 0; i<=10;i++){
            solution.push(i);

        }
        for(int i = 0; i<=10;i++){
            System.out.println(solution.pop());
        }

    }
}
