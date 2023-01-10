package Mathematics;

import java.util.Scanner;

public class Palindrome_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        System.out.println(palindrome(n));
    }
    public static boolean palindrome(int n){
        int rev=0;
        int num=n;
        while(n>0){
            rev=(rev*10)+(n%10);
            n/=10;
        }
        if(num==rev){
            return true;
        }
        else
            return false;
    }
}
