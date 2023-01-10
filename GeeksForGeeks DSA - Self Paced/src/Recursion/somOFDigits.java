package Recursion;

public class somOFDigits {
    public static void main(String[] args) {
        int i=12334;
        System.out.println(sum(i));
    }
    public static int sum(int i){
        if(i==0){
            return 1;
        }
        return i%10+sum(i/10);
    }
}
