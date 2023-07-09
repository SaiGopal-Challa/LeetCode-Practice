import java.util.Scanner;

public class Q35_SearchInsertPosition {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        System.out.println("Enter an array of integers:  \n");
        int[] a = new int[]{inputReader.nextInt()};


        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the target value that is to be inserted:  \n");
        int b = reader.nextInt();
        inputReader.close();
        reader.close();
        System.out.println(searchInsert(a,b));
    }
    public static int searchInsert(int[] nums, int target) {
        //1,1/2,1/4,..... search op; insert => compare < ; if true index-1
        int i = 0; //i is start
        int j = nums.length-1; //j is end
        while (i<= j){
            int m = i + (j-i)/2;
            if (nums[m] == target) return m;
            else if(nums[m] > target) j = m-1;
            else i=m+1;
        }
        return i;
    }
}
