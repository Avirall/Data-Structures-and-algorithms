package Recursion;

public class oneToN {
    public static void main(String[] args) {
        int n=20;
        printNumbers(n);
    }
    public static void printNumbers(int n){
        if(n==1){
            System.out.print(1+" ");
            return;
        }
        printNumbers(n-1);
        System.out.print(n+" ");
    }
}
