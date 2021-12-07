public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {99,89,75,65,42,32,21,10,0,-1,-21,-45,-89,-99};
        int target = -21;
        int ans = Oderagnostic(arr, target);
        System.out.println(ans);
    }

    static int Oderagnostic(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // to check if the array is sorted in ascending or Descending Order

//         boolean isAsc arr[start] < arr[end];
        boolean isAsc;
        if (arr[start] < arr[end]) {
            isAsc = true;
        } else {
            isAsc = false;
        }

            while (start <= end) {
                //find middle element
                // Start + end exceeds the range if integer in java
                int mid = start + (end - start) / 2;
                if (arr[mid] == target) {
                    return mid;
                }
                if (isAsc) {
                    if (target < arr[mid]) {
                        end = mid - 1;
                    } else if (target > arr[mid]) {
                        start = mid + 1;
                    }
                } else {
                    if (target > arr[mid]) {
                        end = mid - 1;
                    } else if (target < arr[mid]) {
                        start = mid + 1;
                    }
                }
            }
            return -1;
        }
    }
