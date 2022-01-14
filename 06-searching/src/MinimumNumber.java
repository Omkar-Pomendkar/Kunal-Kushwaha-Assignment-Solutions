public class MinimumNumber {
    public static void main(String[] args) {
        System.out.println("Minimum Number in Array");
        int [] arr = {1,23,43,67,34,89,23,90};
        int ans = minimum(arr);
        System.out.println(ans);
    }
    static int minimum(int[] arr)
    {        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if(min > arr[i])
            {
                min = arr[i];

            }

        }
        return min;
    }
}
