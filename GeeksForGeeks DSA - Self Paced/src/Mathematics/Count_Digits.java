package Mathematics;

import java.util.Scanner;

public class Count_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        sc.close();
        System.out.println("The Number of digits are: ");
        int count=0;
        while(n>0){
            n/=10;
            count+=1;
        }
        System.out.println(count);
    }
}
