import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        System.out.println("Merge sort using Recursion");
        int[] arr  = {5,4,3,2,1};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));


    }
    static int[] mergeSort(int[] arr)
    {
        if(arr.length == 1)
        {
            return arr;
        }
        //finding middle Element
        int mid = arr.length/2;

        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] Right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,Right);
    }

    static int[] merge(int[] first, int[] second) {
        int[] mix = new int [first.length+second.length];
        int i = 0;
        int j = 0;
        int k = 0; //pointer for mix Array

        while(i < first.length && j < second.length)
        {
            if(first[i] < second[j])
            {
                mix[k] = first[i];
                i++;
            }
            else
            {
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        // It may be possible that one of the Array is not Completed
        //Copy the remaining Elements
        while(i< first.length)
        {
            mix[k] = first[i];
            i++;
            k++;
        }
        while(j< second.length)
        {
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
}
