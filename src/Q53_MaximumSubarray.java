//Given an integer array nums, find the subarray with the largest sum, and return its sum.

public class Q53_MaximumSubarray {
    public static void main(String[] args) {

    }
    public static int maxSubarry(int[] nums){
        int n = nums.length;
        int currSum=nums[0];
        int maxSum = nums[0];
        for(int i=1; i<=n-1; i++){
            // for currSum we check if the element at that index is greater or the element at that index plus currSum value
            currSum= Math.max(nums[i], nums[i]+currSum);

            maxSum= Math.max(currSum, maxSum);
        }

        return maxSum;
    }
}
