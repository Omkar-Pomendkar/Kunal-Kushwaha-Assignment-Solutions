import java.util.Scanner;

public class Q3_Simple_Interest {
    public static void main(String[] args) {
        System.out.println("Write a program to input principal, time, " +
                "and rate (P, T, R) from the user and find Simple Interest.");
        // Simple Interest Problem
        /*
            Formula

             SI  = (p*r*t)/100;

            P	=	initial principal balance   10,000/-
            r	=	annual interest rate        7%
            t	=	time (in years)             10years

         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal Amount");
        int Principal_Amount = sc.nextInt();
        System.out.println("Enter Annual Rate");
        float Annual_Rate = sc.nextFloat();
        System.out.println("Enter Number of Years");
        int Time = sc.nextInt();

        float Simple_Interest = ((Principal_Amount * Annual_Rate*Time)/100);
        System.out.println(Simple_Interest);

    }
}
