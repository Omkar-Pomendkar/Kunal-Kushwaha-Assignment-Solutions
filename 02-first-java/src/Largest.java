import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        System.out.println("Largest");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

//        Q : Find the Largest of 3 Numbers
        int max = a;
        if(b> max)
        {
            max = b;
        }
        if(c> max)
        {
            max = c;
        }
        System.out.println(max);
        int max1 = Math.max(c,Math.max(a,b));
        System.out.println(max1);
    }
}
