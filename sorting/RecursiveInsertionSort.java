class RecursiveInsertionSort{
    public static void main(String[] a){
        int arr[] = {55,12,5,77,96,3,4};
        int n = arr.length;
        System.out.println("Before Sorting");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        recursiveInsertionSort(arr, n);
        System.out.println("After Sorting");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }

    static void recursiveInsertionSort(int arr[], int n){
        if(n <= 1) return;

        recursiveInsertionSort(arr, n-1);

        int temp = arr[n-1];
        int j= n-2;

        while(j>=0 && arr[j]>temp){
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = temp;
    }
}