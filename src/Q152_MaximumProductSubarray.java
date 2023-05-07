public class Q152_MaximumProductSubarray {
    public static void main(String[] args) {

    }
    public static int maxProduct(int[] nums){
        int max = nums[0];
        int min = nums[0];
        int ans = nums[0];
        int n = nums.length;

        for(int i=1; i<n; i++){

            // updating the max and min. We are also keeping min because on multiplying with any negative number your min will become max and max will become min.
            // So for every index i we will take max of (i-th element, prevMax * i-th element, prevMin * i-th element).

            //Swapping min and max
            if(nums[i]<0){
                int temp = max;
                max = min;
                min = temp;
            }

            max = Math.max(nums[i], max*nums[i]);
            min = Math.min(nums[i], min*nums[i]);

            ans = Math.max(ans, max);
        }

        return ans;
    }
}
