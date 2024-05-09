//using linear search
class UpperBoundImplementation{
    public static void main(String[] args){
        int arr[] = {3, 5, 8, 9, 15, 19};
        int n = arr.length;
        int target = 9;
        int index = upperBound(arr,n,target);
        System.out.println("The upper bound is the index : "+index);
    }

    static int upperBound(int arr[], int n, int target){
        for(int i=0; i<n; i++){
            if(arr[i]>target)
                return i;
        }
        return n;
    }
}