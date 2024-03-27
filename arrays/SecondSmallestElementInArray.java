class SecondSmallestElementInArray{
    public static void main(String[] args){
        int arr[] = {5,8,66,1,4,7,6,3,14};
        int n = arr.length;
        int smallest = arr[0];
        for(int i=0; i<n; i++){
            if(arr[i]<smallest)
                smallest = arr[i];
        }

        int second_smallest = Integer.MAX_VALUE;
        System.out.println(second_smallest);

        for(int i=0; i<n; i++){
            if(arr[i] != smallest && arr[i]<second_smallest){
                second_smallest = arr[i];
            }
        }
        System.out.println("Second Smallest Element In an Array is " +second_smallest);
    }
}