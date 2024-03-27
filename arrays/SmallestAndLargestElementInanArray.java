class SmallestAndLargestElementInanArray{
    public static void main(String[] args){
        int arr[] = {5, 58, 9, 87, 33, 4, 54};
        int min = arr[0];
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("Smallest Element In an Array is : "+min);
        System.out.println("Largest Element In an Array is : "+max);
    }
}
