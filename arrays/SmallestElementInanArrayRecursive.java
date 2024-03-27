class SmallestElementInanArrayRecursive{
    public static void main(String[] args){
        int arr[] = {5, 58, 9, 87, 33, 4, 54};
        int n = arr.length;
        System.err.println(smallestElement(arr,n));
    }
    static int smallestElement(int arr[], int n){
        if(n==1)
        return arr[0];

        return Math.min(arr[n-1],smallestElement(arr,n-1));
    }
}