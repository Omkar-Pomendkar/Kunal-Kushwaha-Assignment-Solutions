public class Arrays2 {
    public static void main(String[] args) {

        // Single Dimension Array
        int[] arr = new int[10]; // Array Creation

        // Created integer Array
        int[] marks = {10, 20, 30, 40, 50}; // Array Creation
            // index of array starts from zero
        int size = marks.length;
        System.out.println(size);

        // printing array using for loop
        for (int row = 0; row <size ; row++) {
            System.out.println(marks[row]);

        }
        // print array using for each loop

        for (int element: marks) {
            System.out.println(element);

        }

        // Creation of String Array
        String[] name = new String[5];
        name[0] = "omkar";
        name[1] = "sanjay";
        name[2] = "shraddha";
        name[3] = "surbhi";
        name[4] = "chaitu";

        int size1 = name.length;
        for (int row = 0; row < size1; row++) {
            System.out.println(name[row]);

        }

    }
}
