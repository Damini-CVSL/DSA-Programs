class Insertionsort{
    static void insertionSort(int arr[], int n){  
        for(int i=1; i<n; i++){
            int temp = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j--;
            } 
            arr[j+1] = temp;
        }

        System.out.println("After Sorting");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }
    }

    public static void main(String[] args){
        int arr[] = {55,12,5,77,96,3,4};
        int n = arr.length;
        System.out.println("Before Sorting");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        insertionSort(arr,n);

    }
} 