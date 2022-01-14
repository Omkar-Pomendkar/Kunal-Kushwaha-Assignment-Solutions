public class Sum {
    public static void main(String[] args) {
        System.out.println("Sum of N Number");

        int ans = sum(7);
        System.out.println(ans);

    }

    static int sum(int n) {
        if(n == 1)
        {
            return 1;
        }
        return n+sum(n-1);
    }

}
