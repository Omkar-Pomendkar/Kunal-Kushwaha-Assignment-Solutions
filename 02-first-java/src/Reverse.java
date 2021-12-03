public class Reverse {
    public static void main(String[] args) {
        System.out.println("Reverse a Number");
        int num = 732568;

        int ans = 0;

        while(num > 0)
        {
            int rem = num %10;
            num /= 10;

            ans = ans*10+rem;
        }
        System.out.println(ans);


    }
}
