import java.util.Scanner;

public class Q509_FibonacciNumber {
    public static void main(String[] args){
        Scanner reader =new Scanner(System.in);
        System.out.println("Give an integer a, to find a'th fibonacci number: \n");
        int a = reader.nextInt();
        reader.close();
        System.out.println(fib(a));
    }
    public static int fib(int n) {
        if (n <= 1) return n;

        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }
}
