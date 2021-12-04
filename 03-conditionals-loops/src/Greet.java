


import java.util.Scanner;

//LOGIC
/*
Taking String as an Input and Printing in Sout Statement
 */
public class Greet {
    public static void main(String[] args) {
        System.out.println("Greeting Name");
        Scanner sc = new Scanner(System.in);
        String name  = sc.nextLine();
        System.out.println(name + " Hello How are You?");
    }
}
