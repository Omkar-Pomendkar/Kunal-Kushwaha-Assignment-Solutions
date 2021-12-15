import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
        System.out.println("Selection Sort");
        int [] arr = {2,5,3,4,1};
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));
    }

     static void selectionsort(int[] arr) {
         for (int i = 0; i < arr.length; i++) {
             //find the maximum item in an remaining array and swap it with correct index
                int last = arr.length-i-1;
                int maxIndex = getMaxindex(arr,0,last);
                swap(arr,maxIndex,last);

         }
    }
        static void swap(int [] arr,int first,int second)
        {
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }
     static int getMaxindex(int[] arr, int start, int end) {
        int max = start;
         for (int i = 0; i <= end; i++) {
             if(arr[max] < arr[i])
             {
                 max = i;
             }

         }
         return max;
    }
}
