public class MountainArray {
    public static void main(String[] args) {
    int[] arr = {1,2,3,4,6,7,6,3,2,1};
    int ans = peakIndexMountainArray(arr);
        System.out.println(ans);
    }

    static int peakIndexMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while(start < end)
        {
            int mid = start+(end-start)/2;
            if(arr[mid] > arr[mid+1])
            {
                //you may be in decreasing part of the Array
                //this may be the answer but look in the left
                end = mid;
            }
            else
            {
                //you are in ascending  part of the Array
                start = mid+1;

            }
        }
        return arr[end];
        // at the end start is going to be the largest because of the 2 CHecks above
        // start & end are always find to find maximum element in the above to checks
        // hence when they are pointing to just one element that is max element because that is what th echeck say


    }

}
