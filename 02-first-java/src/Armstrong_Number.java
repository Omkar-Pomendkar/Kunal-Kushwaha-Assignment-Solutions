import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args) {
        System.out.println("Armstrong Number ");
        /*
        153
        1 cube - 1
        5 cube - 125
        3 cube - 27
        Total  - 153
        This is Armstrong Number
         */
       // Scanner sc = new Scanner(System.in);
       // int n = sc.nextInt();
        for (int i = 100; i < 1000; i++) {
            if(isArmstrong(i))
            {
                System.out.println(i + "");
            }

        }
       // System.out.println(isArmstrong(n));

    }
    static boolean isArmstrong(int n)
    {
        int original = n;
        int sum = 0;
        while(n>0)
        {
            int rem = n % 10;
            n = n/10;
            sum = sum + rem*rem*rem;

        }
        if(sum == original){
            return true;
        }
        return false;
    }
}
