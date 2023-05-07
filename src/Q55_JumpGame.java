import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q55_JumpGame {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("enter the integer array: \n");
        //int[] a = new int[]{};

        reader.close();
        //canJump();

    }
    public static boolean canJump(int[] nums){
        int maxDist=0;
        for (int i = 0; i<nums.length; i++){
            if(i > maxDist) return false;
            maxDist = Math.max(i+nums[i], maxDist);
        }
        return true;
    }
}
