// iterative method
class BinarySearch{
    public static void main(String[] args){
        int arr[] = {2,4,6,8,11,88,101,106,111};
        int n = arr.length;
        int target = 88;
        int index = binarySearch(arr,n,target);
        if(index == -1)
            System.out.println("Element is not found");
        else
            System.out.println("Element " +target+ " is found at index "+index);
    }

    static int binarySearch(int arr[], int n, int target){
        int left= 0;
        int right = n-1;

            while(left <= right){
                int mid = (left+right)/2;
                if(arr[mid] == target)
                    return mid;
                else if(target<arr[mid])
                    right = mid - 1;
                else
                    left = mid + 1;
            }
        return -1;
    }
}