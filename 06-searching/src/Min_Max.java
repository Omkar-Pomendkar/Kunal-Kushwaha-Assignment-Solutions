public class Min_Max {
    public static void main(String[] args) {
        System.out.println("Minimum & Maximum element in an Array");
        int[] arr = {12,45,6,78,34,99,100};

        System.out.println(minimum(arr));
    }

     static int minimum(int[] arr) {
         int ans = arr[0];

         for (int i = 1; i < arr.length; i++) {

             if(arr[i] < ans);
             {
                 ans = arr[i];

             }
         }

         return ans;
    }
}
