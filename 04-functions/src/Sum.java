import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        /*
        return_type name()
        {
        //body
        return statement;
        }
         */
       // sum();

//        great();
//        String message = fruits();
//        System.out.println(message);
//        int ans = sum2();
//        System.out.println("Answer is :"+ans);
        int ans = sum3(10,20);
        System.out.println(ans);
    }


    static int sum3(int a,int b)
    {
        int sum = a+b;
        return sum;
    }
    static void sum()
    {

        // pass the value of number when u are Passing the Number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int num1 = sc.nextInt();

        System.out.println("Enter First Number");
        int num2 = sc.nextInt();

        int sum = num1 +num2;
        System.out.println("Sum is "+sum);

    }
    static int sum2()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int num1 = sc.nextInt();

        System.out.println("Enter First Number");
        int num2 = sc.nextInt();

        int sum = num1 +num2;
//        System.out.println("Sum is "+sum);
            return sum;
    }
    static void great()
    {
        System.out.println("Hello Everybody");
    }
    static String fruits()
    {
        String  m = "Mango";
        return m;
    }
}
