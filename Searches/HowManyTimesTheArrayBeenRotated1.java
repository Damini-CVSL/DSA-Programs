public class HowManyTimesTheArrayBeenRotated1 {
    public static int howManyRotation(int[] arr, int n, int minimum) {
        int low = 0, high = n-1;
        int index = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            //search space is already sorted
            //then arr[low] will always be
            //the minimum in that search space:
            if (arr[low] <= arr[high]) {
                if (arr[low] < minimum) {
                    index = low;
                    minimum = arr[low];
                }
                break;
            }

            //if left part is sorted:
            if (arr[low] <= arr[mid]) {
                // keep the minimum:
                if (arr[low] < minimum) {
                    index = low;
                    minimum = arr[low];
                }

                // Eliminate left half:
                low = mid + 1;
            } else { //if right part is sorted:

                // keep the minimum:
                if (arr[mid] < minimum) {
                    index = mid;
                    minimum = arr[mid];
                }

                // Eliminate right half:
                high = mid - 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 20, 1, 2, 3};
        int n = arr.length;
        int minimum = Integer.MAX_VALUE;
        int ans = howManyRotation(arr,n,minimum);
        System.out.println("The array is rotated " + ans + " times.");
    }
}