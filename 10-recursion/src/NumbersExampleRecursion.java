public class NumbersExampleRecursion {
    public static void main(String[] args) {
        // Write a Function that takes in Number & Prints it
        // Print first five Numbers : 1 2 3 4 5 ;
        print(1);

    }
    static void print(int n)
    {   //base condition
        if(n == 5)
        {
            System.out.println(5);
            return; //body
        }
        System.out.println(n);
        //recursive call
        // if you are calling a function again & again you can treat it
        print(n+1);
    }


}

