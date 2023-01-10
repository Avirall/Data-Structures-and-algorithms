package Recursion;

public class ropeCuttingPRoblem {
    public static void main(String[] args) {
        int a=2,b=2,c=2;
        int n=9;
        System.out.println(cutter(n,a,b,c,0));
    }
    public static int cutter(int n, int a,int b, int c,int p){
        if(n<0){
            return -1;
        }
        if(n==0){
            return p;
        }
        p=Math.max(cutter(n-a,a,b,c,p+1),Math.max(cutter(n-b,a,b,c,p+1),cutter(n-c,a,b,c,p+1)));
        return p;
    }
}
