// Brute Force Approach (using LINEAR SEARCH)
class HowManyTimesTheArrayBeenRotated{
    public static void main(String[] args){
        int arr[] = {4, 5, 6, 7, 23, 1, 2, 3};
        int n = arr.length;
        int minimum = Integer.MAX_VALUE;
        int ans = howManyRotation(arr,n,minimum);
        System.out.println("The given array is rotated "+ans+ " times.");
    }

    static int howManyRotation(int arr[], int n, int minimum){
        int index = -1;
        for(int i=0; i<n; i++){
            if(arr[i] < minimum){
                minimum = arr[i];
                index = i;
            }
        }

        return index;
    }
}