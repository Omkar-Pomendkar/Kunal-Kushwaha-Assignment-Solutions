import java.util.Arrays;
import java.util.Scanner;

public class MinMaxArray {
    public static void main(String[] args) {
        System.out.println("Finding Minimum & Maximum Number in an Array");
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = sc.nextInt();
            
        }
        int ans = minimum(arr);
        System.out.println(ans);
       // maximum(arr);
    }

    static int  minimum(int[] arr) {
        //1 2 3 4 5
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {

            if(arr[i] < min)
            {
                min = arr[i];
            }

        }
        return min;
    }

    static void maximum(int[] arr) {
    }
}
