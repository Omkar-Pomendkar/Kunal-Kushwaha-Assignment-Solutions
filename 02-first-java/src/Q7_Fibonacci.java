import java.util.Scanner;

public class Q7_Fibonacci {
    public static void main(String[] args) {
        System.out.println("To calculate Fibonacci Series up to n numbers.");
        int temp;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
       while(count <=num) {
           temp = b;
           b = b + a;      // Value of b = b + Previous(a)
           a = temp;    // Here Value of a = b
           count++;
       }
        System.out.println(b);

    }

    }

