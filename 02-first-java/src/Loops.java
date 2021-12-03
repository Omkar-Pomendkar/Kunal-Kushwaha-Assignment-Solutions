import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        // Q Print numbers from 1 -5
        /*
        for (datatype start end increment/decrement)
         */


        for (int i = 1; i <= 5; i++) {
            System.out.println(i);

        }

        for (int i = 1; i <= 5; i +=1) {
            System.out.println(i);

        }
        /*
        While Loops
        while(condition)
        {
        body
        }

         */
        int num = 1;
        while (num <=10)
        {
            System.out.println(num);
            num ++;
        }
        /*
        do
        {
        }
        while(condition)
         */
        int n=1;
        do {
            System.out.println(n);
            n++;
        }while (n<=4);
    }
}
