package sorting;

public class bubbleSort {
    public static void main(String[] args) {
        int arr[] = {4,52,6,2,21,8,45,9,56};
        arr=new bubbleSort().bubble_sort(arr);
        for(int x : arr){
            System.out.print(x+" ");
        }
    }
    public int[] bubble_sort(int[] arr){
        for(int i =0; i<= arr.length-1-1;i++){
            for (int j =1;j<= arr.length-1-i;j++){
                if(arr[j]>arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        return arr;
    }
}
