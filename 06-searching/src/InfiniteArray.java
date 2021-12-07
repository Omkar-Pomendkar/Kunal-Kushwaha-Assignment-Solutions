public class InfiniteArray {
    public static void main(String[] args) {
        System.out.println("Find Positon of an element in infinite Sorted Array ");
        int[] arr = {1,3,4,5,6,7,9,10};
        int target = 6;
        System.out.println(ans(arr,target));

    }
    static int ans(int[] arr,int target)
    {
        //first find rang
        //first start with box of size 2
        int start = 0;
        int end = 1;
        //condition for target to lie in a range
        while (target > arr[end])
        {
            int temp = end+1;
            //double the box value
            //end = previous end + size of box*2
            end = end +(end -start+1) * 2;
            start = temp;

        }
        return infinitearray(arr,target,start,end);
    }
    static int infinitearray(int[] arr, int target ,int start,int end)
    {

        while(start<= end)
        {
            int mid = start+(end-start)/2;
            if(target > arr[mid])
            {
                start = mid +1;
            }
            else if (target < arr[mid])
            {
                end = mid-1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
}
