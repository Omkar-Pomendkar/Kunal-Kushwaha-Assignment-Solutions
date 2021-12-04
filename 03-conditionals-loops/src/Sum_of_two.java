

import java.util.Scanner;

/*
Logic
1) Taking input 2 Number
2) Output Result
 */
public class Sum_of_two {
    public static void main(String[] args) {
        System.out.println("2.Take two numbers and print the sum of both.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int Result = num1+num2;
        System.out.println(Result);
    }
}
