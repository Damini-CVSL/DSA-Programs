import java.util.ArrayList;

class MergeSort{
    static void mergeSort(int arr[], int low, int high){
        if(low < high){
            int mid = (low + high) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    static void merge(int arr[], int low, int mid, int high){
        ArrayList<Integer> arrnew = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                arrnew.add(arr[left]); 
                left++;
            }
            else{
                arrnew.add(arr[right]); 
                right++;
            }
        }

        while(right <= high){
            arrnew.add(arr[right]); 
            right++;
        }

        while(left <= mid){
            arrnew.add(arr[left]); 
            left++;
        }

        for(int i = low; i <= high; i++){
            arr[i] = arrnew.get(i-low);
        }
    }

    public static void main(String[] args){
        int arr[] = {9, 4, 7, 6, 3, 1, 5};
        int n = arr.length;
        System.out.println("Before Sorting");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        mergeSort(arr, 0, n - 1);
        System.out.println("After Sorting");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
