import java.util.Scanner;

public class Q1_LeapYear {
    public static void main(String[] args) {
        System.out.println("Input a year and find whether it is a leap year or not.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Year");
        int year = sc.nextInt();
        /* Logic of the Program
           1) If year is Divsible by 4 it is Leap year
           2) But If it is Century Year then we have to see it is Divisible by 100 or Not
           3) If it is Completely Divisible 100 then it should be divsible by 400 then print leap year


         */
        if(((year % 4 == 0) && (year % 100!=0)) || (year % 400 == 0))
        {
            System.out.println("It is a Leap Year");
        }
        else
        {
            System.out.println("Its not a Leap Year");
        }


    }
}
