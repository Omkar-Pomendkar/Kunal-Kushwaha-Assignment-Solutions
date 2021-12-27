import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Fruit = sc.nextLine();

        switch (Fruit) {
            case "Mango" -> System.out.println("Mango");

            case "Orange" -> System.out.println("Orange");

            case "Banana"  -> System.out.println("Banana");
        }
    }
}
