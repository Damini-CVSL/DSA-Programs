class SearchElementInRotateDuplicatedArray1{
    public static void main(String[] args){
        int[] arr = {7, 8, 1, 2, 3, 3, 3, 4, 5, 6};
        int n = arr.length;
        int target = 10;
        boolean ans = searchElement(arr,n,target);
        if(ans == false)
            System.out.println("Target element is not found !");
        else 
            System.out.println("Target element is present in given array !");
    }

    static boolean searchElement(int arr[], int n, int target){
        int low = 0;
        int high = n-1;

        while(low <= high){
            int mid = (low+high)/2;

            if(arr[mid] == target)
                return true;

            if(arr[low] == arr[mid] && arr[mid] == arr[high]){
                low = low + 1 ;
                high = high - 1;
                continue;
            }

            if(arr[low] <= arr[mid]){
                if(arr[low] <= target  && target <=arr[mid]){
                    high = mid - 1;
                }else{
                    low = mid + 1;
                }
            }else{
                if(arr[mid] <= target && target <= arr[high]){
                    low = mid + 1;
                }else{
                    high = mid + 1;
                }
            }
        }
        return false;
    }
}