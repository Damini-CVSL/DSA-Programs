// Brute Force Approach (using Linear Search)
class FindingMinimuminRotatedSortedArray{
    public static void main(String[] args){
        int arr[] = {4, 5, 6, 7, 23, 1, 2, 3};
        int n = arr.length;
        int minimum = Integer.MAX_VALUE;
        int ans = searchMin(arr,n,minimum);
        System.out.println("Minimum value in given array is : "+ans);
    }

    static int searchMin(int arr[], int n, int minimum){
        for(int i=0; i<n; i++){
            if(arr[i] < minimum){
                minimum = arr[i];
            }
        }

        return minimum;
    }
}