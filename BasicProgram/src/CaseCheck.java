import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println(sc.next().trim());
        char ch = sc.next().trim().charAt(0);
//        System.out.println(sc.nextLine().trim());
        if(ch >= 'a' && ch <= 'z')
        {
            System.out.println("Lowercase");
        }
        else
        {
            System.out.println("Uppercase");
        }
       // System.out.println(ch);
    }
}
