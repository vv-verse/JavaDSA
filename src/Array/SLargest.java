package Array;

public class SLargest {

      static int getsmax(int arr[]){
        int max = arr[0];
        int smax = Integer.MIN_VALUE;

        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                smax = max;
                max = arr[i];
            }
            else if(arr[i]<max && arr[i]>smax){
                smax = arr[i];
            }
        }
        return smax;
    }

    public static void main(String[] args) {
        int arr[] = {1,5,6,2,9,9};
        int x = getsmax(arr);
        System.out.println(x);
    }
}
