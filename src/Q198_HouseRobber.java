import java.util.Scanner;

public class Q198_HouseRobber {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("enter array of amounts in each house:");
        int[] b = new int[]{reader.nextInt()};
        reader.close();
        System.out.println(rob(b));
    }
    public static int rob(int[] nums){
        int n = nums.length;
        int[] rob = new int[n+1];
        rob[0]=0;
        rob[1]=nums[0];
        for(int i=2; i<=n; i++){
            rob[i]=Math.max(rob[i-1], nums[i-1]+rob[i-2]);

        }

        return rob[n];
    }
}
