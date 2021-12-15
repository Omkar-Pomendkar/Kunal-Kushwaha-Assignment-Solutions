import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        System.out.println("Bubble Sort");
        int[] arr = {1,2,3,4,5};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr) {// run the steps n-1 times
        boolean swapped ;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // for ech step max iteam will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
//                swap if the iteams is smaller then the previous item
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }

            }
            //if u did not swap for a particular value of i,it means the array is Sorted hence stop the program
            if(!swapped) //!false = true
            {
                break;
            }
        }
    }
}