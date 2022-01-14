import java.util.Arrays;

public class Swapping {
    public static void main(String[] args) {
        System.out.println("Swapping");
        int[] arr = {1,2,3,4,5,6};
        swap(arr,1,2);
        System.out.println(Arrays.toString(arr));


    }

     static void swap(int []arr,int a, int b) {

        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
