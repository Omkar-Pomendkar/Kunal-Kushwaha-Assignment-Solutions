import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        System.out.println("Sorting using Bubble Sort");
        int[] arr = {0,2,1,2,0};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if(arr[j]< arr[j-1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }

            }


        }
    }

}
