import java.util.Scanner;

public class Q6_Convert_Currency {
    public static void main(String[] args) {
        System.out.println("Input currency in rupees and output in USD.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Currency in Rupees ");
        float rupee = sc.nextFloat();
        float cent = 0.013f;
        System.out.println(cent*rupee+" USD");
    }
}
