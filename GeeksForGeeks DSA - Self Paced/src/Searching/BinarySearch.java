package Searching;

import java.util.Scanner;

public class BinarySearch{
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
        int pos=BinaryS(element,arr,0,n-1);
        if(pos!=-1){
            System.out.println("Element found at index: "+pos);
        }
        else{
            System.out.println("Element not found");
        }
    }
    public static int BinaryS(int element,int[] arr, int left, int right){
        int mid=(left+right)/2;
        if(arr[mid]==element){
            return mid;
        }
        if(left>right){
            return -1;
        }
        if(arr[mid]>element){
            return BinaryS(element,arr,left,mid-1);
        }
        else{
            return BinaryS(element,arr,mid+1,right);
        }
    }
}