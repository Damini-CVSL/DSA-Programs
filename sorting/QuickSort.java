class QuickSort{
    public static void main(String[] args){
        int arr[] = {4, 6, 2, 5, 7, 9, 1, 3};
        int n = arr.length;
        System.out.println("before Sorting");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        quickSort(arr,0,n-1);
        System.out.println("After Sorting");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }

    static void quickSort(int arr[], int low, int high){
        if(low<high){
            int location = partition(arr, low, high);
            quickSort(arr,low, location-1);
            quickSort(arr, location+1, high);
        }
        
    }

    static int partition(int arr[],int low, int high){
        int pivot = arr[low];
        int i = low;
        int j = high;

        while(i<j){
            while(arr[i]<=pivot && i<= high-1){
                i++;
            }
            while(arr[j]> pivot && j>= low +1){
                j--;
            }
            if(i<j){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
            
        }
        int temp = arr[j];
        arr[j] = arr[low];
        arr[low] = temp;

        return j;
    }
    

}