

public class Q918_MaxSumCircularSubarray {
    public static void main(String[] args) {

    }

    public static int maxSubarraySumCircular(int[] nums){
        int n = nums.length;
        int[] bringFLast = new int[n];
        int[] bringLFirst = new int[n];
        bringLFirst[0] = nums[n-1];
        for(int i=1; i<n; i++){
            bringLFirst[i] = nums[i-1];
        }

        bringFLast[n-1] = nums[0];
        for(int i= n-2; i>=0;i--){
            bringFLast[i] = nums[i+1];
        }
        int a = Math.max(maxSubarray(bringFLast),maxSubarray(bringLFirst));
        int b = Math.max(a, maxSubarray(nums));
        return b;
    }
    public static int maxSubarray(int[] a){
        int n= a.length;
        int currSum = a[0];
        int maxSum = a[0];
        for(int i=1; i<n;i++){
            currSum = Math.max(a[i], a[i]+currSum);
            maxSum=Math.max(currSum, maxSum);
        }
        return maxSum;
    }
}
