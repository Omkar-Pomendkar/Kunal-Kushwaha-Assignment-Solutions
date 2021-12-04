

import java.util.Scanner;

/*LOGIC
Check number Diveds 2
if Divides 2 and return 0 it is Even
OR Odd
 */
public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("Program to Print Even & Odd");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num % 2 == 0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("odd");
        }
    }
}
