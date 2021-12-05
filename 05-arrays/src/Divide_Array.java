import java.util.Scanner;

public class Divide_Array {
    public static void main(String[] args) {
        int [] arr = new int[5];
        int size = arr.length;
        Scanner sc = new Scanner(System.in);

        for (int row = 0; row < arr.length; row++) {
            arr[row] = sc.nextInt();

        }
        for (int row = 0; row < arr.length; row++) {
            System.out.println(arr[row]);

        }
    }
}
