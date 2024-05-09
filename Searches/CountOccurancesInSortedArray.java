//brute force approach (using LINEAR SEARCH)
class CountOccurancesInSortedArray{
    public static void main(String[] args){
        int arr[] = {2, 2 , 3 , 3 , 3 , 3 , 4};
        int n = arr.length;
        int target = 3;
        System.out.println("The given element "+target+" is occured "+countOccurance(arr,n,target)+ " times. ");
    }

    static int countOccurance(int arr[], int n, int target){
        int count = 0;

        for(int i=0; i<n; i++){
            if(arr[i] == target){
                count ++;
            }
        }

        return count;
    }
}