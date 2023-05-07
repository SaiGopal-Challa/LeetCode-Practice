//You are given a 0-indexed array of integers nums of length n. You are initially positioned at nums[0].
//
//Each element nums[i] represents the maximum length of a forward jump from index i. In other words, if you are at nums[i], you can jump to any nums[i + j] where:
//
//0 <= j <= nums[i] and
//i + j < n
//Return the minimum number of jumps to reach nums[n - 1]. The test cases are generated such that you can reach nums[n - 1].



public class Q45_JumpGame2 {
    public static void main(String[] args) {

    }
    public static int jump(int[] nums){
        int a=0;
        int maxDist=0;
        int n = nums.length;
        if(n==1) return 0;
        int current=0;
        for(int i=0; i<n-1; i++){
            maxDist=Math.max(i+nums[i], maxDist);
            if(current==i){
                current=maxDist;
                a++;
            }
            if (current > n - 1) {
                return a;
            }
        }
        return a;
    }
}
/*
    comments???
 */
/*
 public int jump(int[] nums) {
     int n= nums.length;
     int dp[]= new int[n+1];
     Arrays.fill(dp,-1);
    return jump(0,n,nums,dp);
    }
    int  jump(int ind,int n,int nums[],int dp[])
    {
        int ans=0;
        int  min=Integer.MAX_VALUE;
        if(ind>=n-1)
        {
            return 0;
        }
        if(dp[ind]!=-1)
        {
            return dp[ind];
        }
        for(int i=1;i<=nums[ind];i++)
        {
            ans= (1+jump(ind+i,n,nums,dp));
            min= Math.min(ans,min);
        }
        dp[ind]= min;
        return dp[ind];
    }
 */