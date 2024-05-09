//using linear search alogithm
public class LowerBoundImplement {
    public static void main(String[] args) {
        int arr[] = {3, 5, 8, 15, 19};
        int n = arr.length;
        int target = 3;
        int index = lowerBound(arr,n,target);
        System.out.println("The lower bound is the index : "+index);
    }

    static int lowerBound(int arr[], int n, int target){
        for(int i=0; i<n; i++){
            if(arr[i] >= target){
                return i;
            }
        }
        return n;
    }
}
