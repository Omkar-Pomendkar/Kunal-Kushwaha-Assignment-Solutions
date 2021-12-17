public class BSrecusion {
    public static void main(String[] args) {
        int [] arr = {2,3,4,5,6,7,8,9,10};
        int target = 66;
        System.out.println(search(arr,target,0, arr.length-1));

    }
    static int search(int[] arr ,int target,int start,int end)
    {
        if(start > end)
        {
            return -1;
        }
        int mid = start+(end-start)/2;
        if(arr[mid] == target)
        {
            return mid;
        }
        if(target > mid)
        {
            search(arr, target, start, mid-1);
        }
        return search(arr, target, mid+1, end);


    }
}
