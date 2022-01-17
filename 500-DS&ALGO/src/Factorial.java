import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Factorial of a Number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fact(n));
    }

    static int fact(int n) {
        if(n == 1)
        {
            return 1;
        }
        return n*fact(n-1);

    }
}
