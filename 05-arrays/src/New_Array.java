import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class New_Array {
    public static void main(String[] args) {
        System.out.println(" Learning Array");
        Scanner sc = new Scanner(System.in);
//        Syntax of Array
//        datatype [] VariableName = new Datatype[size]

//          One Dimensional Array
//        int[] arr = new int[5];
//        arr[0] = 10;
//        arr[1] = 20;
//        arr[2] = 30;
//        arr[3] = 40;
//        arr[4] = 50;
//        System.out.println(arr[1]);
//
//
//        int[] arr2 = {12,24,36,48,60};
//        int size = arr2.length;
//
//        for (int j : arr2) {
//            System.out.println(j);
//
//
//        // Input in One Dimensional Array
//        int[] ar = new int[5];
//        for (int i = 0; i < ar.length; i++) {
//
//            ar[i] = sc.nextInt();
//
//        }
//        for (int i = 0; i < ar.length; i++) {
//           // Scanner sc = new Scanner(System.in);
//            System.out.println(ar[i]);
//
//        }
//        // Creation of String Array
//        String[] Names = new String[5];
//        Names [0] = "Omkar";
//        Names [1] = "Omkar";
//        Names [2] = "Omkar";
//        Names [3] = "Omkar";
//        Names [4] = "Omkar";
//        int size1 = Names.length;
//            for (int i = 0; i < Names.length; i++) {
//                System.out.println(Names[i]);
//            }
//
//            }

////        2 Dimensional Array
//        int[][] arr = {
//                {1,2,3},
//                {3,4,5},
//                {3,4,6}
//        };
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//
//            }
//            System.out.println("");
//
//        }
        int[][] arr = new int[3][3];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                //System.out.print(arr[row][col]);
                arr[row][col] = sc.nextInt();
            }
          //  System.out.println();
        }
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col]);
//                arr[row][col] = sc.nextInt();
            }
            System.out.println();
        }
    }
}
