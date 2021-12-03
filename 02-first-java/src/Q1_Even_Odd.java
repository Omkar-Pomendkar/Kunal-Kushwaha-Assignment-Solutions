import java.util.Scanner;

public class Q1_Even_Odd {
    public static void main(String[] args) {
        System.out.println("Write a program to print whether a number is even or odd, also take input.");
        // Even Odd Program If num % 2 == 0 EVEN else ODD
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num % 2 == 0)
        {
            System.out.println("Number is Even");
        }
        else
        {
            System.out.println("Number is Odd");
        }
    }
}
