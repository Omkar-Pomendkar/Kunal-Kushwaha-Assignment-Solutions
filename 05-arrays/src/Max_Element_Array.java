public class Max_Element_Array {
    public static void main(String[] args) {
        System.out.println("Max Value in an Array");
        int[] arr = {1, 4, 3, 7, 8};
//        System.out.println(max(arr));
        System.out.println(maxinRange(arr,0,3));
    }


    static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;

    }

    static int maxinRange(int[] arr, int start, int end) {
        int max = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
