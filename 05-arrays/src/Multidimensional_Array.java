import java.util.Scanner;

public class Multidimensional_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        1 2 3
        4 5 6
        7 8 9
         */
//        int[][] arr = new int[3][3];
//            int [][] arr2 = {
//
//                    {1,2,3},
//                    {4,5},
//                    {6,7,8}
//
//        };
     int[][] arr = new int[3][3];
        System.out.println(arr.length);
        //input
        
        for(int row = 0;row <arr.length;row++)
        {   //for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
                
            }
        }
        //Output
        for(int row = 0;row <arr.length;row++)
        {   //for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");

            }
            System.out.println();
        }
        
    }
}
