import java.util.Scanner;

public class Copy_Array_Another {
    public static void main(String[] args) {
//        int [] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        int[] newarr = new int[5];
        System.out.println("Original Array");
        for (int row = 0; row < arr.length; row++) {
            newarr[row] = sc.nextInt();

        }
        System.out.println("New Array");
        for (int row = 0; row < arr.length; row++) {
            System.out.println(arr[row]);

        }
    }
}
