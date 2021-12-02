import java.util.Scanner;

public class Q2_Sum {
    public static void main(String[] args) {
        System.out.println("Take two numbers and print the sum of both.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number");
        int num2 = sc.nextInt();
        int sum = num1+ num2;
        System.out.println("SUM : "+sum);
    }
}
