import java.util.Scanner;

public class Q7_ReverseInteger {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter an Integer: ");
        int a = reader.nextInt();
        reader.close();
        System.out.println(reverse(a));
    }
    public static int reverse(int x) {
        long sum=0;
        int k=x;
        if(x<0)
            k=(-1)*k;
        while(k>0){
            sum=sum*10+x%10;
            x=x/10;
            k=k/10;
        }
        if(sum<Math.pow(-2,31) || sum>Math.pow(2,31) )
            return 0;
        else
            return (int)sum;
    }
}
