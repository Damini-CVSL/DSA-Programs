class UpperBoundImplementation1{
    public static void main(String[] args){
        int arr[] = {3, 5, 8, 9, 15, 19};
        int n = arr.length;
        int target=9;
        int index = upperBound(arr,n,target);
        System.out.println("The upper bound is the index: " + index);
    }
    static int upperBound(int arr[], int n, int target){
        int low = 0;
        int high = n-1;
        int ans = n;
        while(low <= high){
            int mid = (low+high)/2;
            
            if(arr[mid] > target){
                ans = mid;

                high = mid - 1;
            }else{
                low = mid + 1; 
            }
        }

        return ans;
    }
}