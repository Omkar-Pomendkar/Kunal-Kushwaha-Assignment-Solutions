public class Prime1 {
    public static void main(String[] args) {
        System.out.println("Check Number is Prime or Not");

        System.out.println(isPrime(3));
    }
    static boolean isPrime(int n)
    {
        if(n < 2)
        {
            return false;
        }
        int c = 2;
        while(c <= n )
        {
            if(n%2 == 0)
            {
               return false;
            }
            c += 1;
        }
       // System.out.println("Prime");
        return true;
    }

}
