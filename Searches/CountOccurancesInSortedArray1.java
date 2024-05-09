// optimal approach (using BINARY SEARCH) 
class CountOccurancesInSortedArray1{
    public static void main(String[] args){
        int[] arr =  {2, 4, 6, 8, 8, 8, 11, 13};
        int n = arr.length;
        int element = 1;
        int ans = count(arr,n,element);
        System.out.println("The number of occurance is :"+ans) ;
    }

    static int count(int arr[], int n, int element){
        int[] ans = countOccurance(arr,n,element);
        if(arr[0] == -1)
            return 0;
        return (ans[1]-ans[0]+1);
    }

    static int[] countOccurance(int arr[], int n, int element){
        int first = firstOccurance(arr,n,element);
        if(first == -1) 
            return new int[] {-1, -1};
        int last = lastOccurance(arr,n,element);
            return new int[] {first,last};
    }

    static int firstOccurance(int arr[], int n, int element){
        int low = 0;
        int high = n-1;
        int first = -1;

        while(low<=high){
            int mid = (low+high)/2;

            if(arr[mid] == element){
                first = mid;

                high = mid - 1;
            }else if(arr[mid] < element)
                low = mid + 1;
            else    
                high = mid - 1;
        }
        return first;
    }

    static int lastOccurance(int arr[], int n, int element){
        int low = 0;
        int high = n-1;
        int last = -1;

        while(low<=high){
            int mid = (low+high)/2;

            if(arr[mid] == element){
                last = mid;

                low = mid + 1;
            }else if(arr[mid] < element)
                low = mid + 1;
            else    
                high = mid - 1;
        }
        return last;
    }
}