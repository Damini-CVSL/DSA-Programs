import java.util.Arrays;
class FirstHalfAscendingAndSecondHalfDescendingMethod2{
    public static void main(String[] args){
        int arr[] = {3, 2, 4, 1, 10, 30, 40, 20};
        int n = arr.length;
        order(arr,n);

    }

    static void order(int arr[], int n){
        Arrays.sort(arr);


        for(int i=0; i<n/2; i++){
            System.out.print(arr[i] + " ");
        }

        for(int j=n-1; j>=n/2; j--){
            System.out.print(arr[j]+ " ");
        }
    }
}