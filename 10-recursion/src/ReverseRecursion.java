public class ReverseRecursion {
    public static void main(String[] args) {
     //   print(5);
       // printreverse(5);
        printboth(5);
    }

    static void print(int n) {
        if (n == 0) {
            return;
        }
        print(n-1);
        System.out.println(n);

    }
    static void printreverse(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printreverse(n-1);

    }
    static void printboth(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printboth(n-1);
        System.out.println(n);

    }
}
