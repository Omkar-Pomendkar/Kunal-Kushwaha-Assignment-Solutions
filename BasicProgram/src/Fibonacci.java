import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Finonacci Series");
        // 0 , 1 , 1 , 2 , 3 , 5 , 8 , 13 ;
        // 0   1   2   3   4   5   6    7

        // Find the nth Fibonnaci Number
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

        while(count <= n) {
            int temp = b;
                b = b + a;
                a = temp;
                count ++;
        }
        System.out.println(b);
    }
}
