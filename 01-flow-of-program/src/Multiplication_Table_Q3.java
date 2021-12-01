import java.util.Scanner;

public class Multiplication_Table_Q3 {
    public static void main(String[] args) {
        System.out.println("Take a number as input and print the multiplication table for it.");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i*num);

        }
    }
}
