public class SumDigit {
    public static void main(String[] args) {
        System.out.println("Sum of Digits");
        int ans = Sum(7777);
        System.out.println(ans);
    }
    static int Sum(int n)
    {
        if(n==0)
        {
            return n;
        }
        int rem = n%10;
        n = n/10;
        return Sum(n)+rem;
    }
}
