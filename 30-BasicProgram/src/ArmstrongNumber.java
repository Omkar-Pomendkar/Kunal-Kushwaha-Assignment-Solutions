import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("Check whether number is Armstrong Number");
        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
        for (int i = 100; i <1000 ; i++) {
            if(isArmstrong(i))
            {
                System.out.println(i);
            }

        }
//        boolean ans = isArmstrong(num);
//        System.out.println(ans);
    }
    static boolean isArmstrong(int num)
    {
        int original = num;
        int sum = 0;

        while(num > 0)
        {
            int rem = num%10;
            num = num/10;
            sum = sum + rem*rem*rem;
        }
        return sum == original;

            }
}
