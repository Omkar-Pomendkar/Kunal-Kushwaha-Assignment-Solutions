import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr) {
        boolean swapped;
        //run the steps n times
        for (int i = 0; i < arr.length; i++) {
            swapped = false; // if u did not swap break the loop
            //for each steps, max item will come at last respective index
            for (int j = 1; j < arr.length-i ; j++) {
                //swap if the item is smaller then previous
                if(arr[j] <arr[j-1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
                
            }
            //if you did not swap for particular value of i,it means array is sorted hence stop the loop

            if(!swapped)
            {

                break;
            }

        }
    }


}
