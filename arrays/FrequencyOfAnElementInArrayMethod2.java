import java.util.Arrays;
class FrequencyOfAnElementInArrayMethod2{
    public static void main(String[] args){
        int arr[] = {5, 8, 5, 7, 8, 10};
        int n = arr.length;
        countFrequency(arr,n);
    }
    static void countFrequency(int arr[], int n){
        Arrays.sort(arr);

        for(int i=0; i<n; i++){
            int count = 1;

            while(i<n-1 && arr[i]==arr[i+1]){
                count++;
                i++;
            }

            System.out.println(arr[i] + " occurs " + count + " times ");
        }
    }
}