package Mathematics;

import java.util.Scanner;

public class divisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n:");
        int n = sc.nextInt();
        sc.close();
        for(int i=1;i*i<=n;i++){
            if(n%i==0)
            System.out.print(i+" ");
        }

        for( double i=Math.sqrt(n);i>=1;i--){
            if(n%i==0 && i!=(n/i))
                System.out.print((int)(n/i)+" ");
        }
    }
}
