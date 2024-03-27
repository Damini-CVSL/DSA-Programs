class ReverseAnArray{
    public static void main(String[] args){
        int arr[] = {5, 6, 6, 9, 7, 5, 3, 63};


        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i] + " ");
        }
    }
}