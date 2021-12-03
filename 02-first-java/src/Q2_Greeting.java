import java.util.Scanner;

public class Q2_Greeting {
    public static void main(String[] args) {
        System.out.println("Take name as input and print a greeting message for that name.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name = sc.nextLine();
        System.out.println("Welcome "+name+"  to Kunal Kushwaha Problem Set Solution");
    }
}
