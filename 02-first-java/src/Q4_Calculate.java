import java.util.Scanner;

public class Q4_Calculate {
    public static void main(String[] args) {
        System.out.println("Take in two numbers and an operator (+, -, *, /) " +
                "and calculate the value. (Use if conditions)");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        float num1 = sc.nextFloat();
        System.out.println("Enter Second Number");
        float num2 = sc.nextFloat();
        System.out.println("Enter the Operator");
        char op = sc.next().charAt(0);
        if(op == '+')
        {
            System.out.println("Additon of Num1 & Num2"+(num1+num2));
        }
        else if (op == '-')
        {
            System.out.println("Substraction of Num1 & Num2"+(num1-num2));
        }
        else if (op == '*')
        {
            System.out.println("Multiplication of Num1 & Num2"+(num1*num2));
        }
        else if (op == '/')
        {
            System.out.println("Division of Num1 & Num2"+(num1/num2));
        }
        else
        {
            System.out.println("Invalid Operator");
        }


    }
}
