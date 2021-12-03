import java.util.Scanner;

public class Q5_LargestNumber {
    public static void main(String[] args) {
        System.out.println("Take 2 numbers as input and print the largest number.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number");
        int num2 = sc.nextInt();
        if(num1 > num2)
        {
            System.out.println(num1+" is greater");
        }
        else
        {
            System.out.println(num2+" is greater");
        }
    }
}
