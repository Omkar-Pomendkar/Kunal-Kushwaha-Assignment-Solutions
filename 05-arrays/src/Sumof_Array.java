import java.util.Scanner;

public class Sumof_Array {
    public static void main(String[] args) {
        int [] arr = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int row = 0; row < arr.length; row++) {
            arr[row] = sc.nextInt();

        }
        int ans = 0;
        for (int row = 0; row < arr.length; row++) {
            ans = ans+arr[row];
           // System.out.println(arr[row]);

        }
        System.out.println(ans);
    }
}
