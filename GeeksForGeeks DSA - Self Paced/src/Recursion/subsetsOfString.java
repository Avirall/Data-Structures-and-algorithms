package Recursion;

public class subsetsOfString {
    public static void main(String[] args) {
        String s="ABC";
        String c="";
        subsets(s,c,s.length(),0);
    }
    public static void subsets(String s,String curr,int l,int n){
        if(l<=n){
            System.out.print(" "+curr+" ");
            return;
        }
        //System.out.print(" "+curr+" ");
        subsets(s,curr+s.charAt(n),l,n+1);
        subsets(s,curr,l,n+1);
    }
}
