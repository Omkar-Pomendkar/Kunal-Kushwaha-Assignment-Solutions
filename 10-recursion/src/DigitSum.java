public class DigitSum {
    public static void main(String[] args) {
        System.out.println("1342 = 1+3+4+2");
        int ans = digitSum(1342);
        System.out.println(ans);
    }

    static int digitSum(int n) {
        if(n == 0)
        {
            return 0;
        }
        int rem = n % 10;
        n = n/10;
        return rem+digitSum(n);
        //return (n%10) + digitSum(n/10);
    }
}
