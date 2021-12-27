public class Sum {
//    Q : Take input of 2 number & print the Sum
public static void main(String[] args) {
//    great();
//    int c = sum(10,20);
    int a = 10;
    int b = 20;

    swap(a,b);
    System.out.println(a +" "+b);
//    System.out.println(c);

}
//static void great()
//{
//    System.out.println("Hello World");
//}
//static int sum(int a,int b)
//{
////    int a = 10 ,b = 10 ;
////   System.out.println(a+b);
//   return a+b;
//}
static void swap(int a,int b)
{
    int temp = a;
    a = b;
    b = temp;
//    System.out.println(a+" "+b);
//    return temp;
}
}
