import java.util.Scanner;

public class Q213_HouseRober2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("enter array of amounts in each house:");
        //int[] b = new int[]{reader.nextInt()};
        reader.close();
        //System.out.println(rob(b));
    }
    public static int rob(int[] nums){
        int n = nums.length;
        if(n==1){
            return nums[0];
        }
        int s1 = robCheck(nums,0,n-2);
        int s2 = robCheck(nums, 1, n-1);
        return Math.max(s1,s2);
    }

    private static int robCheck(int[] nums, int k, int l){
        int a = 0, b = nums[k];
        for (int i=k+1; k<=l; i++){
            int c = Math.max(nums[i]+a, b);
            a=b;
            b=c;
        }
        return b;
    }
}
