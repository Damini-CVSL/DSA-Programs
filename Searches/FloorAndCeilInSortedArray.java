class FloorAndCeilInSortedArray{
    public static void main(String[] args){
        int arr[] = {3, 4, 4, 7, 8, 10};
        int n = arr.length;
        int target = 5;

        int[] ans = getFloorAndCeil(arr,n,target);
        System.out.println("The Floor and Ceil are : "+ans[0]+ " " +ans[1]);
    }

    static int[] getFloorAndCeil(int arr[], int n, int target){
        int floor = getfloor(arr, n , target);
        int ceil = getceil(arr, n, target);
        return new int[] {floor,ceil};
    }

    static int getfloor(int arr[], int n, int target){
        int low = 0;
        int high = n-1;
        int ans = -1;

        while(low <= high){
            int mid = (low+high)/2;

            if(arr[mid] <= target){
                ans = arr[mid];

                low = mid + 1;
            }else{
                high = mid - 1;
            }

        }
        return ans;
    }

    static int getceil(int arr[], int n, int target){
        int low = 0;
        int high = n-1;
        int ans = -1;

        while(low <= high){
            int mid = (low+high)/2;

            if(arr[mid] >= target){
                ans = arr[mid];

                high = mid - 1;
            }else{
               low = mid + 1;
            }

        }
        return ans;
    }
}