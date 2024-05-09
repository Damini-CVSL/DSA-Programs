class LinearSearch{
    public static void main(String[] args){
        int arr[]={1,2,3,4,5};
        int len = arr.length;
        int target = 4;
        linearSearch(arr, len, target);

        
    }

    static void linearSearch(int arr[], int len, int target){

        boolean found = false;
        for(int i=0; i<len; i++){
            if(arr[i] == target){
                found = true;
                System.out.print("Element " +target+ " is found at index "+i);
                break;
            }
        }
        if(found == false)
            System.out.println("Element is not found");
    }
}