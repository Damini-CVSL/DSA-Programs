//optimal approach(using BINARYSEARCH)
import java.util.*;
class SearchElementInRotateSortedArray1{
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(7, 8, 9, 1, 2, 3, 4, 5, 6));
        int n = arr.size();

        int key = 5;
        int index = searchElement(arr,n,key);
        if(index == -1)
            System.out.println("Target element is not found !");
        else
            System.out.println("Target element " +key+ " is found at index "+index);
        
    }

    static int searchElement(ArrayList<Integer> arr, int n, int key){
        int low = 0;
        int high = n-1;
        int ans = -1;

        while(low<=high){
            int mid = (low+high)/2;

            if(arr.get(mid) == key)
                return mid;
            
            if(arr.get(low) <= arr.get(mid)){
                if(arr.get(low) <= key  && key <= arr.get(mid)){
                    high = mid - 1;

                }else{
                    low = mid + 1;

                }
            } else{
                if(arr.get(mid) <= key && key <= arr.get(high)){
                    low = mid + 1; 
                }else{
                    high = mid - 1;
                }
            }
            
        }
        return ans;
    }
}