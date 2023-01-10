package Recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        int n=3;
        counts(n,'A','B','C');
    }
    public static void counts(int n, char A, char B, char C){
        if (n == 1)
        {
            System.out.println("Move 1 from " +  A + " to " + C);
            return;
        }
        counts(n-1, A, C, B);
        System.out.println("Move " + n + " from " +  A + " to " + C);
        counts(n-1, B, A, C);
    }
}
