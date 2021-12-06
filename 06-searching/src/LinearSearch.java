public class LinearSearch {
    public static void main(String[] args) {
        System.out.println("Linear Search");
        int[] arr = {12,54,67,89,43,56,78};
        int target = 67;
        int ans = linearsearch(arr,target);
        System.out.println(ans);
    }

     static int linearsearch(int[] arr, int target) {
        if(arr.length == 0)
        {
            return -1;
        }
         for (int index = 0; index < arr.length; index++) {
             if(target == arr[index])
             {
                 return index;
             }

         }
         return -1;
    }
}
