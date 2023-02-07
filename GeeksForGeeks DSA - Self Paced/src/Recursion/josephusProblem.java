package Recursion;

public class josephusProblem {
    public static void main(String[] args) {
        int n=7,k=3;
        System.out.println(kill(n,k));
    }
    public static int kill(int n, int k){

        //int curr=0;
        if(n==1){
            return 0;
        }

        return kill(n-1,k);
    }
}
