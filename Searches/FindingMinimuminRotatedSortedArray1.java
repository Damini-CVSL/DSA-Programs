//optimal Approach (using binary search)

class FindingMinimuminRotatedSortedArray1{
    public static void main(String[] args){
        int arr[] = {4, 5, 6, 7, 20, 1, 2, 3};
        int n = arr.length;
        int minimum = Integer.MAX_VALUE;
        int ans = searchMin(arr,n,minimum);
        System.out.println("Minimum value in given array is : "+ans);
    }

    static int searchMin(int arr[], int n, int minimum){
        int low = 0;
        int high = n - 1;

        while(low <= high){
            int mid = (low + high)/2;

            if(arr[low] < arr[mid]){
                if(arr[low] < minimum)
                    minimum = arr[low];
                    low = mid + 1;
            }else{
                if(arr[mid] < minimum)
                    minimum = arr[mid];
                    high =  mid - 1;
            }
        }
        return minimum;
    }
}