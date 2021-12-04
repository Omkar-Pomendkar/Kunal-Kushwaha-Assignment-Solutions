

import java.util.Scanner;

public class Largest2 {
    public static void main(String[] args) {
        System.out.println("Largest among 2 Numbers");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if(num1>num2)
        {
            System.out.println(num1 + "is Greater");
        }
        else
        {
            System.out.println(num2 + "is Greater");
        }
    }
}
