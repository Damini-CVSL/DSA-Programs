import java.util.ArrayList;

class SlidingWindow{
    public static void main(String[] args){
        int arr[] = {4,0,-1,3,5,3,6,8};
        int k = 3;
        ArrayList<Integer> ans;
        ans = maxSlidingWindow(arr, k);
        System.out.println("Maximum element in every "+k+ " window");
        for(int i=0; i<ans.size(); i++){
            System.out.print(ans.get(i)+ " ");
        }
    }

    static ArrayList<Integer> maxSlidingWindow(int arr[], int k){
        int left =0, right=0;
        ArrayList<Integer> max = new ArrayList<>();

        while(right < k-1){
            right++;
        }

        while(right < arr.length){
            getMax(arr,left,right,max);
            left++;
            right++;
        }

        return max;
    }

    static void  getMax(int arr[], int left, int right, ArrayList<Integer> max){
        int maxi = Integer.MIN_VALUE;
        for(int i=left; i<=right; i++){
            maxi = Math.max(maxi, arr[i]);
        }
        max.add(maxi);
    }
}