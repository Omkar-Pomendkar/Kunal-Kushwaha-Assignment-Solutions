import java.util.Scanner;

public class Second_Largest {
    public static void main(String[] args) {
        int [] arr = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int row = 0; row < arr.length; row++) {
            arr[row] = sc.nextInt();

        }
        int largest = arr[0];
//        System.out.println(arr[0]);
        for (int row = 0; row < arr.length; row++) {
            if(arr[row] > largest)
            {
                largest = arr[row];
            }
//            ans = ans+arr[row];
            // System.out.println(arr[row]);

        }
        System.out.println(largest-1);
    }
    }

