import java.util.Arrays;
import java.util.Scanner;

public class Arrays1 {
    public static void main(String[] args) {
        System.out.println("What is Array");

        /*
                Array is a dataStructure collection of similar (int) data/Objects
         */

//        Syntax of Array
//        datatype array_name [] = new datatype[size];

        // Array Declaration
//            int arr[] ;

        // Array Initialization
//                     1  2  3  4  5
//            arr[] = {10,20,30,40,50};
//            index =   0  1  2  3  4

        // Array Creation
        int [] arr = new int[5];
        arr[0] = 10;
        arr[1] = 12;
        arr[2] = 13;
        arr[3] = 14;
        arr[4] = 15;
        System.out.println(arr.length);

        //Printing Array using For Loop
        for (int i : arr) {
            System.out.println(i);
        }

        // String Array Creation
        String [] Fruit = {"mango","banana","Apple"};

        // for- each Loop
        for(String s : Fruit)
        {
            System.out.println(s);
        }

        int [] arr1 = new int [5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
             arr1[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr1[i]+ " ");
        }

        System.out.println(Arrays.toString(arr1));
//
//        for(int a : arr1) // here a represent element of array
//        {
//
//        }

        String [] str = new String[5];
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();

        }
        System.out.println(Arrays.toString(str));
        str[1] = "Pomendkar";
        System.out.println(Arrays.toString(str));




    }
}
