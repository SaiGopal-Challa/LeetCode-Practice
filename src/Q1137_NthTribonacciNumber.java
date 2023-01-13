import java.util.Scanner;

public class Q1137_NthTribonacciNumber {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Give an integer a, to find a'th tribonacci number: \n");
        int a = reader.nextInt();
        reader.close();
        System.out.println(tribonacci(a));
    }
    public static int tribonacci(int n) {
        if(n<=0){return n;}
        else if(n==1){return n;}
        else{
            int[] trib = new int[n+1];
            trib[0]=0;
            trib[1]=1;
            trib[2]=1;
            for(int i=3; i<trib.length ; i++){
                trib[i]= trib[i-1]+trib[i-2]+trib[i-3];
            }
            return trib[n];
        }
    }
}
