public class Pattern2 {
    public static void main(String[] args) {
        System.out.println("Pattern 2 ");

        for (int row = 0; row < 6; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print("*");

            }
            System.out.println("");

        }
    }
}
