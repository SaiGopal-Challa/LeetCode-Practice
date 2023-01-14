import java.lang.reflect.Array;
import java.util.Scanner;

public class Q746_MinCostClimbingStairs {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("enter array of costs:");
        int[] b = new int[]{reader.nextInt()};
        reader.close();
        System.out.println(minCostClimbingStairs(b));
    }
    public static int minCostClimbingStairs(int[] cost){
        int n = cost.length ;
        for(int i=2 ; i<n ; i++){
            cost[i] = Math.min(cost[i-1] , cost[i-2]) + cost[i];
        }
        return Math.min(cost[n-1] , cost[n-2]);
    }
}
