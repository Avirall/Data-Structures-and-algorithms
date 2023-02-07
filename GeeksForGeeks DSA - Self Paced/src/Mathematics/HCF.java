package Mathematics;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number a:");
        int a = sc.nextInt();
        System.out.println("Enter the number b:");
        int b= sc.nextInt();
        sc.close();
        System.out.println("The HCF of "+a+" and "+b+" is "+GCD(a,b));
    }
    public static int GCD(int a, int b){
        if(b>a){
            return GCD(b,a);
        }
        if(b==0){
            return a;
        }
        else {
            return GCD(b, a % b);
        }
    }
}
