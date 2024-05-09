//using binary search algorithm
public class LowerBoundImplement1{
    public static void main(String[] args){
        int arr[] = {3, 5, 8, 15, 19};
        int n = arr.length;
        int target = 23;
        int index = lowerBound(arr,n,target);
        System.out.println("The lower bound is the index: " + index);
    }

    static int lowerBound(int arr[], int n, int target){
        int low = 0;
        int high = n-1;
        int ans = n;

        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] >= target)
            {
                ans =  mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }  
        }
        return ans;
    }
}