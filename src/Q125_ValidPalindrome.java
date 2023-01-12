import java.util.Scanner;

public class Q125_ValidPalindrome {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Give a string to check if it is a Palindrome: \n");
        String a = reader.next();
        reader.close();
        if(isPalindrome(a)){
            System.out.println("Given string is a palindrome");
        }
        else {
            System.out.println("Given string is not a palindrome");
        }
    }
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int i = 0;
        int j = s.length() - 1;
        while(i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
