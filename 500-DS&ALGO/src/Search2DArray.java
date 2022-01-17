import java.util.Arrays;

public class Search2DArray {
    public static void main(String[] args) {
        System.out.println("Search in 2D Array");
        int[][] arr = {
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}
        };
        int target = 18;
        boolean ans = search(arr,target);
        System.out.println(ans);
    }

    static boolean search(int[][] arr, int target) {
        for (int[] element : arr) {
            for (int col = 0; col < element.length; col++) {

                if (element[col] == target) {
                    return true;
                }
            }

        }
        return false;
    }

}
