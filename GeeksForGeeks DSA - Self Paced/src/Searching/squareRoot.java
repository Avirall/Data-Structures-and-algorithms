package Searching;

import java.util.Scanner;

public class squareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number= sc.nextInt();
        sc.close();
        if(number<0){
            System.out.println("Enter valid number");
        }
        else
        System.out.println(squareroot(number,0,number));
    }
    
    public static int squareroot(int number,int low, int high) {
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(mid*mid==number){
                return mid;
            }
            else if(mid*mid>number){
                high=mid-1;
            }
            else{
                low=mid+1;
                ans=mid;
            }
        }
        return ans;
    }
}
