public class Binary_Search  {
    public static void main(String[] args) {
        int [] arr = {12,34,56,76,89,99};
        int target = 99;
        int ans = binarysearch(arr,target);
        System.out.println(ans);

    }
    static int binarysearch(int[]arr,int target)
    {
        if(arr.length == 0)
        {
            return -1;
        }
        int start = 0;
        int end = arr.length-1;

        while(start <=end)
        {
            //find middle element
            // Start + end exceeds the range if integer in java
            int mid = start + (end-start)/2;

            if(target < arr[mid])
            {
                end = mid -1;
            }
            else if(target > arr[mid])
            {
                start = mid+1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
}
