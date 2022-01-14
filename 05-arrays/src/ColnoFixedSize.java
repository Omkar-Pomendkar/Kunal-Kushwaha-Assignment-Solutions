import java.util.Scanner;

public class ColnoFixedSize {
    public static void main(String[] args) {
        System.out.println("Column in not Fixed Sized");
        Scanner sc = new Scanner(System.in);
        int [][] arr =
                {{1,2,3},
                {5,6},
                {7,8,9}};



        for (int[] ints : arr) {
            for (int col = 0; col < ints.length; col++) {

                System.out.print(ints[col]);
            }
            System.out.println("");

        }
    }
}
