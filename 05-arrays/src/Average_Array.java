import java.util.Scanner;

public class Average_Array {
    public static void main(String[] args) {
        int ans = 0;
        int avg = 0;

        int [] arr = new int[5];
        int size = arr.length;
        System.out.println(size);
        Scanner sc = new Scanner(System.in);

        for (int row = 0; row < arr.length; row++) {
            arr[row] = sc.nextInt();

        }

        for (int row = 0; row < arr.length; row++) {
            ans = ans+arr[row];
            avg = ans/size;
            // System.out.println(arr[row]);

        }
        System.out.println(avg);
    }
    }

