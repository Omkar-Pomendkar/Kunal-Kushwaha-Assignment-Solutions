

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

/*
LOGIC


 */
public class User_input {
    public static void main(String[] args) {
        System.out.println("Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.");


        int sum = 0;

        while(true)

        {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            char x;
            sum +=num;
            if(num == 'x');
            break;

        }
        System.out.println(sum);
    }
}
