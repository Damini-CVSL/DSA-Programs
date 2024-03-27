// iteration method
class LargestElementInArray{
    public static void main(String args[]){
        int arr[] = {5, 6, 9, 4, 7, 56, 15,};

        int max = arr[0];

        for(int i=0; i<arr.length ;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Largest element in an given array " +max);

    }
}