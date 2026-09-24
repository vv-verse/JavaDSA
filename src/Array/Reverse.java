package Array;

public class Reverse {
    public static void main(String[] args) {
        int arr[]={2,4,5,3,2,9};
        int a = 0;
        int b = arr.length-1;

        while(a<b){
            int temp=arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
            a++;
            b--;

        }
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
