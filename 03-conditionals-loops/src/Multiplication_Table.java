

import java.util.Scanner;

public class Multiplication_Table {
    public static void main(String[] args) {
        System.out.println("3. Take a number as input and print the multiplication table for it.");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        //2x1=2
        int v = 10;
        for (int i = 1; i <= v; i++) {
            System.out.println(number +"X"+i+"=" + number * i);
        }
    }
}
