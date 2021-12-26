import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        System.out.println("To check whether it is Prime or Not");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number<1)
        {
            System.out.println("Prime");
        }
        int c = 2;
        while(c*c < number)
        {
            if(number%c == 0)
            {
                System.out.println("Not Prime");
            }

                c = c + 1;

        }

        System.out.println(number+"is Prime");
    }
}
