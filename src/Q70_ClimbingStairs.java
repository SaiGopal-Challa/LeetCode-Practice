import java.util.Arrays;
import java.util.Scanner;

public class Q70_ClimbingStairs {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("enter no.of steps:");
        int b = reader.nextInt();
        reader.close();
        System.out.println(climbStairs(b));
    }
    public static int climbStairs(int n) {

        // return solverec(n)

        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        // return solvedp(n,dp);

        return solveTopDown(n);

    }
    // recusive
    private static int solverec(int n){
        if(n==0 || n==1) return 1;
        if(n<0) return 0;

        return solverec(n-1)+solverec(n-2);
    }

    // bottom-up approach
    private static int solvedp(int n,int dp[]){
        if(n==0 || n==1) return 1;
        if(n<0) return 0;

        if(dp[n]!=-1) return dp[n];
        return dp[n]=solvedp(n-1,dp)+solvedp(n-2,dp);
    }

    // top-down approach

    private static int solveTopDown(int n){

        int dp[]=new int[n+1];

        dp[0]=1;
        dp[1]=1;

        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];

    }
}
