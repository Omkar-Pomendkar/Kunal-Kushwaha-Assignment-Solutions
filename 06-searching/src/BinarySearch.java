public class BinarySearch {
    public static void main(String[] args) {
        System.out.println("Binary Search");
            int[] arr = { 55,2,4,6,7,32,45,65,68,99};
            int target = 32;
            int ans = binarysearch(arr,target);
        System.out.println(ans);
    }

     static int binarysearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        while(start <= end) {
            //find Middle Element
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                //ans found
                return mid;
            }
        }
        return -1;
    }
}
