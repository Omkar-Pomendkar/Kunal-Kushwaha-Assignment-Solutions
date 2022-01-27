public class factrecursion {
    public static void main(String[] args) {
        System.out.println("Factorial Program");
        int n = 5;
        System.out.println(fact(n));

    }

    static int fact(int n) {
        if(n == 1)
        {
            return n;
        }
        return n*fact(n-1);
    }


}
