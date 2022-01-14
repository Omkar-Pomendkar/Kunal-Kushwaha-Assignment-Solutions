public class MaxValueArray {
    public static void main(String[] args) {
        int [] arr = {12,34,56,78,67,99};
        System.out.println(max(arr,0,4));

    }

     static int max(int[] arr,int start,int end) {
         int max = arr[start];
         for (int i = 0; i < end; i++) {
             if(arr[i] > max)
             {
               max = arr[i];
             }

         }

            return  max;
    }



}
