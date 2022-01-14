public class LinearSearch {
    public static void main(String[] args) {
        System.out.println("Linear Search");
        int[] arr = {12,34,56,23,43,75,90,100};
        int target = 23;
        int ans = linearsearch(arr,target);
        System.out.println(ans);
    }
    static int linearsearch(int[] arr, int target)
    {
        if(arr.length == 0)
        {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if(element == target)
            {
                return i;
            }

        }
        return -1;
    }
}
