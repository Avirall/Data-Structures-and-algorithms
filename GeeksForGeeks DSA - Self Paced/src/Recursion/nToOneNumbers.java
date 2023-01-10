package Recursion;

public class nToOneNumbers {
    public static void main(String[] args) {
        int N=10;
        //nToOneNumbers x = new nToOneNumbers();
        new nToOneNumbers().printNumbers(N);
    }
    public void printNumbers(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.print(n+" ");
        printNumbers(n-1);
    }
}
