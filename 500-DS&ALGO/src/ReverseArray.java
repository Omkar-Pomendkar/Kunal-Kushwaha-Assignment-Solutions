import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        System.out.println("Reversing Array");
        /*
        1) Initialize start and end indexes as start = 0, end = n-1
        2) In a loop, swap arr[start] with arr[end] and change start and end as follows :
        start = start +1, end = end – 1
         */
        int[] arr = {10,20,30,40,50,60,70};
        reverseArray(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void reverseArray(int[] arr,int start,int end) {

        while(start <= end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }


    }
}
