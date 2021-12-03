import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Calculator Program");
        Scanner sc = new Scanner(System.in);

        //Take input from user does not enter X or x
        int ans = 0;
        while(true)
        { System.out.println("Enter the Operator");
            char op = sc.next().trim().charAt(0);
            if(op == '-' ||op == '+'||op =='/'||op =='*')
            {
                //Input two Numbers
                System.out.println("Enter the Numbers");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                if(op == '+')
                {
                    ans = num1 +num2;
                }
                if(op == '/')
                {
                    ans = num1 /num2;
                }
                if(op == '-')
                {
                    ans = num1 -num2;
                }
                if(op == '*')
                {
                    ans = num1 *num2;
                }
            }
            else if(op == 'x'|| op == 'X')
            {
                break;

            }
            else
            {
                System.out.println("Invalid Operation");
            }
            System.out.println(ans);
        }

    }
}
