import java.util.Scanner;

public class Case_Check {
    public static void main(String[] args) {
        System.out.println("Taking Input as a Character");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);
        String word = "Kunal";
        System.out.println(word.charAt(2));
    }
}
