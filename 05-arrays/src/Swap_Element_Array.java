import java.util.Arrays;

public class Swap_Element_Array {
    public static void main(String[] args) {
        System.out.println("Swapping Array");
        int[] arr = {1,34,56,3,45,78};
        swap(arr,1,3);
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }

     static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }
    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start < end)
        {
            swap(arr,start,end);
            start++;
            end --;
        }
    }
}
