class FindingLastOccurance{
    public static void main(String[] args){
        // array must be in sorted array
        int arr[] = {3,4,13,13,13,13,20,40};
        int n = arr.length;
        int key = 13;
        System.out.println("Last occurance of given key "+key+ " is " +lastOccurance(arr, n, key));
    }

    static int lastOccurance(int arr[], int n, int key){
        int ans = -1;
        for(int i=n-1; i>=0; i--){
            if(arr[i] == key){
                ans = i;
                break;
            }
        }
        return ans;
    }
}