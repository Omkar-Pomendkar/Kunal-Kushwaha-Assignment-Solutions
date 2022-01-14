public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = { 55,2,4,6,7,32,45,65,68,99};
        int target = 32;
        int ans = ans(arr,target);
        System.out.println(ans);
    }
    static int ans(int[] arr, int target)
    {
        // Find the Range
        // First start with box of size 2
        int start = 0;
        int end = 1;

        //condition for target to lie in range is what
        while(target > arr[end])
        {
            int temp = end+1;// this is new Start
            // double the box value
            // end = previous end +size of box * 2;
            end = end +(end-start+1)*2;
            start = temp ;
        }
        return binarysearch(arr,target,start,end);
    }
    static int binarysearch(int[] arr, int target ,int start ,int end) {

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
