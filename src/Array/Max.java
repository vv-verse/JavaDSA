class Max {
    public static void main(String[] args) {
        int arr[]={2,5,7,34,1};
        int max = arr[0];

        for(int i = 0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("largest elemnt is : "+max);
    }
}