package Mathematics;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        sc.close();
        System.out.println(Factorial(n));
    }
    public static int Factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        else return n*Factorial(n-1);
    }
}
