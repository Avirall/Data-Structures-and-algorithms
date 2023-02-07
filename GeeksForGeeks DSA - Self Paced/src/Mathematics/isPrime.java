package Mathematics;

import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        sc.close();
        Boolean Prime=true;
        if(n%2==0 || n%3==0){
            Prime=false;
            System.out.println(false);
        }
        else{
            for(int i=5;i<=Math.sqrt(n);i+=6){
                if(n%i==0 || n%(i+2)==0){
                    Prime=false;
                    System.out.println(false);
                    break;
                }
            }
        }
        if(Prime){
            System.out.println(Prime);
        }
    }
}
