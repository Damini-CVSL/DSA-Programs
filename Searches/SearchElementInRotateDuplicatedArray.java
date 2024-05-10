//Brute Force Approach(using LINEAR SEARCH)
class SearchElementInRotateDuplicatedArray{
    public static void main(String[] args){
        int[] arr = {7, 8, 1, 2, 3, 3, 3, 4, 5, 6};
        int n = arr.length;
        int target = 3;
        boolean ans = searchElement(arr,n,target);
        if(ans == false)
            System.out.println("Target element is not found !");
        else 
            System.out.println("Target element is present in given array !");
        
    }

    static boolean searchElement(int arr[], int n, int target){

        for(int i=0; i<n; i++){
            if(arr[i] == target)
                return true;
        }
        return false;
    }
}