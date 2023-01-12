import java.util.Scanner;

public class Q680_ValidPalindrome2 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Give a string to check if it is valid palindrome II: \n");
        String a = reader.next();
        reader.close();
        if(validPalindrome(a)){
            System.out.println("given string is a valid palindrome II.\n");
        }
        else {
            System.out.println("given string is not a valid palindrome II. \n");
        }
    }
    public static boolean validPalindrome(String s) {
        if(s==null){
            return false;
        }
        Pair pair = findDiff(s, 0, s.length()-1);
        if(pair.left>=pair.right){
            return true;
        }
        return isPalindrome(s, pair.left+1, pair.right)||
                isPalindrome(s, pair.left, pair.right-1);
    }
    private static Pair findDiff(String s, int left, int right){
        while(left < right && s.charAt(left)==s.charAt(right)){
            right--;
            left++;
        }
        return new Pair(left, right);
    }
    static boolean isPalindrome(String s, int left, int right){
        Pair pair = findDiff(s, left, right);
        return pair.left>=pair.right;
    }
}
class Pair{
    int left, right;
    public Pair(int left, int right){
        this.right = right;
        this.left = left;
    }
}
