import java.util.Scanner;

public class Q367_ValidPerfectSquare {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter a number: ");
        int n = reader.nextInt(); // Scans the next token of the input as an int.
//once finished
        reader.close();
        boolean d = solution(n);
        if(d){
            System.out.println("it is perfect square");
        }
        else {
            System.out.println("not a perfect square");
        }
    }
    public static boolean solution(int num){
        long a=1;
        long b= num;
        while (a<=b){
            long c = (a+b)/2;
            if(c*c == num){
                return true;
            }
            else if (c*c > num){
                b = c-1;
            }
            else{
                a = c+1;
            }
        }
        return false;
    }
}
