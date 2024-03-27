import java.util.Arrays;
class FrequencyOfAnElementInArray{
    public static void main(String[] args){
        int arr[] = {10, 30, 10, 20, 10, 20, 30, 10};
        int n = arr.length;
        frequencyOfAnElement(arr,n);
    }

    static void frequencyOfAnElement(int arr[], int n){
        boolean visited[] = new boolean[n];
        Arrays.fill(visited,false);


        for(int i=0; i<n; i++){

            if(visited[i] == true)
                continue;

            int count = 1;
            for(int j=i+1; j<n; j++){
                if(arr[i] == arr[j]){
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " occured " + count + " times ");
        }

    }
}