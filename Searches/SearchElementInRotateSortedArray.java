import java.util.*;
class SearchElementInRotateSortedArray{
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(7, 8, 9, 1, 2, 3, 4, 5, 6));
        int n = arr.size();
        int key = 9;
        int ans = searchElement(arr,n,key);
        if(ans == -1)
            System.out.println("Element is not present!");
        else
            System.out.println("Element " +key+ " is  not found at index "+ans);

    }

    static int searchElement(ArrayList<Integer> arr, int n, int k){
        for(int i=0; i<n; i++){
            if(arr.get(i) == k){
                return i;
            }
        }
        return -1;
    }
}