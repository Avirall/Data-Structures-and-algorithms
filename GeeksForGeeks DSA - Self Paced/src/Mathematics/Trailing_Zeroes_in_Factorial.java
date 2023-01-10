package Mathematics;

import java.util.Scanner;
//Naive Solution.........causes stack overflow issues
public class Trailing_Zeroes_in_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int temp=factors(n);
        int count=0;
        while(temp%10==0){
            temp/=10;
            count++;
        }
        System.out.println("The number of trailing zeroes are: "+count);
    }
    public static int factors(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        else return n*factors(n-1);
    }
}
