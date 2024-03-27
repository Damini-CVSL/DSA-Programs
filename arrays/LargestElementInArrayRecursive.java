class LargestElementInArrayRecursive{
    public static void main(String[] args){
        int arr[] = {5, 6, 9, 4, 7, 56, 15,};
        int n = arr.length;
        System.err.println(largestElement(arr,n));
    }

    static int largestElement(int arr[],int n){
        if(n==1)
        return arr[0];
        
        return Math.max(arr[n-1],largestElement(arr,n-1));
    }
}
