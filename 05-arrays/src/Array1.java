import java.util.Arrays;
import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        System.out.println("Creating Array");


//        /syntax
    //        datatype [] Variable_name = new datatype [size]
        int[] rollno = new int[5];
//        or
        int[] rollno2 = {10,45,67,8,66};
        rollno2 [2] = 67;
        System.out.println(rollno2[2]);

        int[] rollnos ; //declaration of an arrayint hte stack
        rollnos = new int[10]; //initializtion hera actual object is Created
        Scanner sc = new Scanner(System.in);
//        int arr[] = new int[5];
//        arr[0] = 20;
//        arr[1] = 40;
//        arr[2] = 30;
//        arr[3] = 260;
//        arr[4] = 208;
//        System.out.println(arr[3]);
////        input using for loop
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//
//        }
//        System.out.println(Arrays.toString(arr));
////        print arr[i]
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//
//        }











//        int [] arrs  = new int [10];
//
//        int[] marks = {10,20,30,40,50};
//        int size = marks.length;
//        System.out.println(size);
//
//        // Displaying size of Array
//        for (int mark : marks) {
//            System.out.println(mark);
//
//        }
//        for (int row = 0; row < size; row++) {
//            System.out.println(marks[row]);
//
//        }
//        for(int element : marks){
//            System.out.println(element);
//        }
//
//        // Creation of String Array
//        String [] fruit = {"Mango","Orange","Banana"};
//        for (int row = 0; row < fruit.length; row++) {
//            System.out.println(fruit[row]);
//
//
//        }

//        Array of Objects
        String[] name = new String[4];
        for (int i = 0; i < name.length; i++) {
            name[i] = sc.next();

        }
        System.out.println(Arrays.toString(name));
    }
}
