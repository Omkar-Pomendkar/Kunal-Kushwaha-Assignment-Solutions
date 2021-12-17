public class Pattren1 {
    public static void main(String[] args) {
        System.out.println("Pattern 1");
        /*
               * * * * *
               * * * * *
               * * * * *
               * * * * *
               * * * * *
         */

        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                System.out.print("*");
            }
            System.out.println("");

        }
    }
}
