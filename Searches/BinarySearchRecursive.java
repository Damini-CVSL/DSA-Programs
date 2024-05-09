class BinarySearchRecursive{
    public static void main(String[] args){
        int[] arr = {3, 4, 6, 7, 9, 12, 16, 17};
        int n = arr.length;
        int target = 23;
        int index = binarySearchRecursive(arr, 0, n-1,  target);
        if(index == -1)
            System.out.println("Element is not found");
        else
            System.out.println("Element " +target+ " is found at index "+index);

    }

    static int binarySearchRecursive(int arr[], int left, int right,  int target){
        if(left>right)
            return -1;

        int mid = (left+right)/2;
        if(arr[mid] == target)
            return mid;
        else if(target > arr[mid])
            return binarySearchRecursive(arr, mid+1, right, target );
        return binarySearchRecursive(arr, left, mid-1, target);
    }
}