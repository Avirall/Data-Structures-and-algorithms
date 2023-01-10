package Recursion;

public class palindromeCheckRecursion {
    public static void main(String[] args) {
        String s = "abbal";
        System.out.println(palindrome(s,0,s.length()-1));
    }
    public static boolean palindrome(String s,int i, int f){
        if(i>=f){
            return true;
        }
        if(s.charAt(i)==s.charAt(f)){
            palindrome(s,i+1,f-1);
        }
        else {
            return false;
        }
        return true;
    }
}
