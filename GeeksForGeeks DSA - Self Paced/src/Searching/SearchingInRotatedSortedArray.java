package Searching;

import java.util.Scanner;

public class SearchingInRotatedSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number elements");
        int n =sc.nextInt();
        System.out.println("Enter the elements of array");
        int[] arr= new int[n];
        for(int i =0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element you want to search for: ");
        int element=sc.nextInt();
        sc.close();
        Search(element,arr,0,n-1);
    }

    public static int Search(int element,int[] arr, int low, int high) {
        while(low<=high){
            int mid=(low+high)/2;
            if(mid==element){
                return mid;
            }
            else if(mid>element){
                
            }
        }
        return -1;
    }
}
