import java.util.Scanner;

public class PrintReverse_Array {
    public static void main(String[] args) {
//        int [] arr = {1,2,3,4,5};
        int [] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        //input 1 2 3 4 5
        for (int row = 0; row < arr.length; row++) {
            arr[row] = sc.nextInt();

        }
        //output 5 4 3 2 1

//        for (int row = 0; row < arr.length; row++) {
//            System.out.println(arr[row]);
//
//        }
        for (int row = 4; row >= 0; row--) {
            System.out.println(arr[row]);

        }


    }
}
