package Mathematics;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number a:");
        int a = sc.nextInt();
        System.out.println("Enter the number b:");
        int b= sc.nextInt();
        sc.close();
        int lcm= (a*b)/GCD(a,b);
        System.out.println("The lcm of "+a+" and "+b+" is "+lcm);
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
