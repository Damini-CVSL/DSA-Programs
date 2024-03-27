class SumOfElementsInAnArrayRecurssive{
    public static void main(String[] args){
        int arr[] = {8, 85, 6, 52, 7, 63};
        int n = arr.length;
        System.err.println(sum(arr, n));
    }

    static int sum(int arr[], int n){
        if(n==1)
            return arr[0];

        return(arr[n-1]+sum(arr,n-1));
    }
}